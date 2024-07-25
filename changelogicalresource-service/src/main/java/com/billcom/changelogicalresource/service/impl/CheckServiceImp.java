package com.billcom.changelogicalresource.service.impl;

import com.billcom.changelogicalresource.bean.Extern;
import com.billcom.changelogicalresource.bean.client.DataBaseClient;
import com.billcom.changelogicalresource.configuration.KafkaConfig;
import com.billcom.changelogicalresource.exceptions.FailedException;
import com.billcom.changelogicalresource.exceptions.PendingException;
import com.billcom.changelogicalresource.model.mongo.OrderProcessHistDTO;
import com.billcom.changelogicalresource.model.mongo.order.*;
import com.billcom.changelogicalresource.model.mongo.order.action.ActionsDTO;
import com.billcom.changelogicalresource.model.mongo.order.product.ProductsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.rmi.RemoteException;
import java.util.Objects;


@Service
@Slf4j
@RequiredArgsConstructor
public class CheckServiceImp {

    final KafkaConfig kafka;
    final DataBaseClient database;

    OrderDTO order;

    private ActionsDTO targetAction;

    public void loopThrowProducts(ActionsDTO action) {
        log.info("[MS][INFO] START LOOPING THROW PRODUCTS...");

        for (ProductsDTO product : action.getProducts()) {
            if (isValidStatus(product.getProductProcessedStatus())) {
                log.info("[MS][INFO] START FETCHING DATA FROM JSON...");
                if (product.getProductCode().equalsIgnoreCase(Extern.getActionMsisdnSwap())) {
                    Integer coId = action.getContractSpec().getCoId();
                    Integer newRes = Integer.getInteger(product.getProductDetail().getProductResource().getLogicalResource().getValue());
                    log.info("[MS][INFO] DONE FETCHING DATA FROM JSON.");
                    database.changeContractResource(coId, newRes);
                    sendToOrderProcHist("Contract: " + action.getContractSpec().getCoCode() + " resource:" + newRes + " changed successfully", Extern.getStatusSuccess(), action.getActionCode());
                }
            }
        }
        log.info("[MS][INFO] DONE LOOPING THROW PRODUCTS.");
    }

    public void checkForWorks(ActionsDTO action) {
        loopThrowProducts(action);
    }

    public void loopThrowActions(String value) throws JsonProcessingException, RemoteException {
        log.info("[MS][INFO] START CONVERTING ORDER...");
        order = getOrderDTO(value);
        log.info("[MS][INFO] ORDER IN INPUT({})", order.toJson());
        log.info("[MS][INFO] DONE CONVERTING ORDER({})", order.getCommandId());
        order.setTopic(Extern.getTopicThis());


        if (order.getActions() != null && !order.getActions().isEmpty()) {
            log.info("[MS][INFO] START LOOPING THROW ACTIONS...");
            for (ActionsDTO action : order.getActions()) {
                targetAction = action;
                log.info("[MS][INFO] START CHECKING FOR ACTION_CODE...");
                log.info("[MS][INFO] ACTION_CODE: {}", action.getActionCode());
                if (isValidStatus(action.getActionProcessedStatus()) && (action.getActionCode().equalsIgnoreCase(Extern.getActionMsisdnSwap()))) {
                    checkForWorks(action);
                    action.setActionProcessedStatus(Extern.getStatusProcessed());
                    order.setRetryFailed(null);
                }
                targetAction = null;
            }
            log.info("[MS][INFO] DOME LOOPING THROW ACTIONS.");
        }
        sendSuccessful();
    }

    public void exceptionHandler(String key, String value) {
        log.info("=======================INPUT=======================");
        try {
            loopThrowActions(value);
        } catch (JsonProcessingException e) {
            log.error("[MS][ERROR] Infected JSON({})", e.getMessage());
            sendToOrderProcHist("Infected JSON " + e.getMessage(), Extern.getStatusFailed(), targetAction.getActionCode());
            kafka.produceMessageTo(Extern.getTopicFailed(), key, value);
        } catch (FailedException e) {
            log.error("[MS][WARN] FailedException:{}", e.getError());
            sendFailed(e.getError());
        } catch (WebClientResponseException webClientResponseException) {
            log.debug("[MS][DEBUG] **** WebClientResponse Exception ****");
            log.error("Error Response Code is {} and Response Body is {}"
                    , webClientResponseException.getRawStatusCode(), webClientResponseException.getResponseBodyAsString());
            log.error("Exception in method getCoId()", webClientResponseException);
            sendFailed(webClientResponseException.getResponseBodyAsString());
        } catch (RemoteException e) {
            log.debug("[MS][DEBUG] **** REMOTE Exception ****");
            String x = e.toString();
            String exc = x.substring(0, Math.min(x.length(), 200));
            log.error("[MS][ERROR] CONNECTION RELATED ERROR: " + e + "\n CAUSED BY :" + e.getCause());
            sendFailed(exc);
        } catch (PendingException e) {
            log.debug("[MS][DEBUG] **** PENDING Exception ****");
            sendPending(e.getCoId());
        } catch (Exception e) {
            String exceptionMessage = e.toString();
            String shortMessage = exceptionMessage.substring(0, Math.min(exceptionMessage.length(), 200));
            log.error("[MS][ERROR] Exception caused by({})", shortMessage, e);
            sendFailed(exceptionMessage);
        }
        log.info("=======================OUTPUT=======================");
    }

    public OrderDTO getOrderDTO(String value) throws JsonProcessingException {
        return new ObjectMapper().readValue(value, OrderDTO.class);
    }

    public void sendSuccessful() {
        kafka.produceMessage(order.getCommandId(), order.toJson());
    }

    public void sendFailed(String error) {
        setProductAndActionStatus(Extern.getStatusFailed());
        sendToOrderProcHist(error, Extern.getStatusFailed(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicFailed(), order.getCommandId(), order.toJson());
    }

    public void sendPending(String coId) {
        setProductAndActionStatus(Extern.getStatusPending());
        sendToOrderProcHist("Contract (" + coId + ") has a pending Request in progress", Extern.getStatusPending(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicPending(), order.getCommandId(), order.toJson());
    }

    public void sendToOrderProcHist(String des, String status, String actionCode) {
        if (Objects.isNull(des) || des.equalsIgnoreCase("null")) des = "Internal Micro-Service Error";
        OrderProcessHistDTO local = new OrderProcessHistDTO(Extern.getMicroserviceName(), Extern.getTopicThis(), order.getCommandId(), des, status, actionCode);
        kafka.produceMessageTo(Extern.getTopicHistory(), order.getCommandId(), local.toString());
    }

    boolean isValidStatus(String actionStatus) {
        if (actionStatus == null) return true;
        return !actionStatus.equalsIgnoreCase(Extern.getStatusProcessed());
    }

    private void setProductAndActionStatus(String status) {
        if (targetAction != null) targetAction.setActionProcessedStatus(status);
    }
}



