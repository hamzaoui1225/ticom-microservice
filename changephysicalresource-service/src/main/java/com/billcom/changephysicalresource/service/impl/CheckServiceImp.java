package com.billcom.changephysicalresource.service.impl;

import com.billcom.changephysicalresource.bean.Extern;
import com.billcom.changephysicalresource.bean.client.SqlExecuteClient;
import com.billcom.changephysicalresource.configuration.KafkaConfig;
import com.billcom.changephysicalresource.exception.ExceptionFactory;
import com.billcom.changephysicalresource.exception.PendingException;
import com.billcom.changephysicalresource.model.mongo.OrderProcHistoryDTO;
import com.billcom.changephysicalresource.model.mongo.order.ActionsDTO;
import com.billcom.changephysicalresource.model.mongo.order.OrderDTO;
import com.billcom.changephysicalresource.model.mongo.order.product.ProductsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class CheckServiceImp {

    final KafkaConfig kafka;
    final SqlExecuteClient sql;
    OrderDTO order;
    private ActionsDTO targetAction;

    public OrderDTO getOrderDTO(String value) throws JsonProcessingException {
        return new ObjectMapper().readValue(value, OrderDTO.class);
    }

    public void loopThrowProducts(ActionsDTO action) throws JsonProcessingException {
        log.info("[MS][INFO] START LOOPING THROW PRODUCTS...");

        for (ProductsDTO product : action.getProducts()) {
            if (isValidStatus(product.getProductProcessedStatus())) {
                String actionCode = product.getProductCode();
                if (actionCode.equalsIgnoreCase(Extern.getActionImsiSwap())) {
                    //   product.setProductProcessedStatus(Extern.getStatusFailed());
                    log.info("[MS][INFO] START FETCHING DATA FROM JSON...");
                    Integer coId = action.getContractSpec().getCoId();
                    String newResource = product.getProductDetail().getProductResource().getPhysicalResource().getValue();

                    log.info("[MS][INFO] DONE FETCHING DATA FROM JSON.");
                    sql.changePhysicalResource(coId, newResource);
                    log.info("[MS][INFO] DONE CHANGING PHYSICAL RESOURCE.");
                    logOut("Contract: " + action.getContractSpec().getCoCode() + " resource:" + newResource + " changed successfully", Extern.getStatusSuccess(), action.getActionCode());
                }
                product.setProductProcessedStatus(Extern.getStatusProcessed());
            }
        }
        log.info("[MS][INFO] DONE LOOPING THROW PRODUCTS.");
    }

    public void checkForWorks(ActionsDTO action) throws JsonProcessingException {
        loopThrowProducts(action);
    }

    public void loopThrowActions(String value) throws JsonProcessingException {
        log.info("[MS][INFO] START CONVERTING ORDER...");
        order = getOrderDTO(value);
        log.info("[MS][INFO] ORDER IN INPUT({})", order.toJson());
        log.info("[MS][INFO] DONE CONVERTING ORDER({})", order.getCommandId());
        order.setTopic(Extern.getTopicThis());
        if (order.getActions() != null && !order.getActions().isEmpty()) {
            log.info("[MS][INFO] START LOOPING THROW ACTIONS...");
            for (ActionsDTO action : order.getActions()) {
                targetAction = action;
                if (isValidStatus(action.getActionProcessedStatus())) {
                    log.info("[MS][INFO] START CHECKING FOR ACTION_CODE...");
                    log.info("[MS][INFO] ACTION_CODE: {}", action.getActionCode());
                    if (action.getActionCode().equalsIgnoreCase(Extern.getActionImsiSwap())) {
                        action.setActionProcessedStatus(Extern.getStatusFailed());
                        checkForWorks(action);
                        action.setActionProcessedStatus(Extern.getStatusProcessed());
                        order.setRetryFailed(null);
                    }
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
            kafka.produceMessageTo(Extern.getTopicFailed(), key, value);
        } catch (PendingException e) {
            log.warn("[MS][WARN] CONTRACT({}) HAS PENDING", e.getCoId());
            sendPending(e.getCoId());
        } catch (Exception e) {
            var excFac = new ExceptionFactory(e);
            log.error("[MS][WARN] FailedException: ([{}]: {})", excFac.getErrorCode(), excFac.getError());
            sendFailed("[" + excFac.getErrorCode() + "] " + excFac.getError());
        }
        log.info("=======================OUTPUT=======================");
    }

    public void sendSuccessful() {
        kafka.produceMessage(order.getCommandId(), order.toJson());
    }

    public void sendFailed(String error) {
        setProductAndActionStatus(Extern.getStatusFailed());
        logOut(error, Extern.getStatusFailed(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicFailed(), order.getCommandId(), order.toJson());
    }

    public void sendPending(String coId) {
        setProductAndActionStatus(Extern.getStatusPending());
        logOut("Contract (" + coId + ") has a pending Request in progress", Extern.getStatusPending(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicPending(), order.getCommandId(), order.toJson());
    }

    public void logOut(String des, String status, String actionCode) {
        if (Objects.isNull(des) || des.equalsIgnoreCase("null")) des = "Internal Micro-Service Error";
        OrderProcHistoryDTO local = new OrderProcHistoryDTO(Extern.getMicroServiceName(), Extern.getTopicThis(), order.getCommandId(), des, status, actionCode);
        kafka.produceMessageTo(Extern.getTopicHistory(), order.getCommandId(), local.toString());
    }

    public void setProductAndActionStatus(String status) {
        if (targetAction != null) targetAction.setActionProcessedStatus(status);
    }

    public boolean isValidStatus(String actionStatus) {
        if (actionStatus == null) return true;
        return !actionStatus.equalsIgnoreCase(Extern.getStatusProcessed());
    }
}
