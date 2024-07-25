package com.billcom.changecontractstatus.service.impl;

import com.billcom.changecontractstatus.bean.Extern;
import com.billcom.changecontractstatus.bean.client.DataBaseClient;
import com.billcom.changecontractstatus.configuration.KafkaConfig;
import com.billcom.changecontractstatus.exception.FailedException;
import com.billcom.changecontractstatus.exception.PendingException;
import com.billcom.changecontractstatus.model.mongo.MicroServiceLogDTO;
import com.billcom.changecontractstatus.model.mongo.order.ActionsDTO;
import com.billcom.changecontractstatus.model.mongo.order.OrderDTO;
import com.billcom.changecontractstatus.model.mongo.order.product.ProductsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class CheckServiceImp {

    final KafkaConfig kafka;
    final DataBaseClient database;

    private OrderDTO order;
    private ActionsDTO targetAction;

    private final Map<String,Integer> actions = Map.of(
            Extern.getActionActivation().toLowerCase(), 2,
            Extern.getActionSuspend().toLowerCase(), 3,
            Extern.getActionDesactivation().toLowerCase(),4
    );

    public String getStringFromObject(Object value) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(value);
    }
    public OrderDTO getOrderFromString(String value) throws JsonProcessingException {
        return new ObjectMapper().readValue(value, OrderDTO.class);
    }

    public void loopThrowProducts(ActionsDTO action){
        log.info("[MS][INFO] START LOOPING THROW PRODUCTS...");

        for (ProductsDTO product: action.getProducts()) {
            if (isValidStatus(product.getProductProcessedStatus()) && actions.containsKey(product.getProductCode().toLowerCase())) {
                log.info("[MS][INFO] START FETCHING DATA FROM JSON...");
                log.info("[MS][INFO] DONE FETCHING DATA FROM JSON.");
                database.changeContractStatus(action.getContractSpec().getCoId(), product.getProductCode().toLowerCase().substring(0,1));
                log.info("[MS][INFO] DONE CHANGING CONTRACT STATUS.");
                log.info("[MS][INFO] Contract ({}) ({})",action.getContractSpec().getCoId() ,product.getProductCode().toLowerCase());
                sendLog("Contract: " + action.getContractSpec().getCoId() + " is " + product.getProductCode() + " with success",Extern.getStatusSuccess(),action.getActionCode());
            }
        }
        log.info("[MS][INFO] DONE LOOPING THROW PRODUCTS.");

    }
    public void checkForWorks(ActionsDTO action) {
        if (isValidStatus(action.getActionProcessedStatus())) {
            loopThrowProducts(action);
            action.setActionProcessedStatus(Extern.getStatusProcessed());
            order.setRetryFailed(null);
        }
    }
    public boolean isValidStatus(String actionStatus) {
        if (actionStatus == null) return true;
        return !actionStatus.equalsIgnoreCase(Extern.getStatusProcessed());
    }
    public void loopThrowActions(String value) throws JsonProcessingException, FailedException {
        log.info("[MS][INFO] START CONVERTING ORDER...");
        order = getOrderFromString(value);
        log.info("[MS][INFO] DONE CONVERTING ORDER({})",order.getCommandId());
        order.setTopic(Extern.getTopicThis());
        if (order.getActions() != null){
            log.info("[MS][INFO] START LOOPING THROW ACTIONS...");
            for (ActionsDTO action : order.getActions()) {
                targetAction = action;
                log.info("[MS][INFO] START CHECKING FOR ACTION_CODE...");
                log.info("[MS][INFO] ACTION_CODE: {}", action.getActionCode());
                if (actions.containsKey(action.getActionCode().toLowerCase()) && (action.getProducts() != null)){
                    checkForWorks(action);
                }
                targetAction = null;
            }
            log.info("[MS][INFO] DOME LOOPING THROW ACTIONS.");
        }
        sendSuccess();
    }
    public void exceptionHandler(String key, String value) {
        log.info("=======================INPUT=======================");
        try {
            loopThrowActions(value);
        }
        catch (JsonProcessingException e) {
            log.error( "[MS][ERROR] Infected JSON({})",e.getMessage() );
            sendLog("Infected JSON "+e.getMessage(),Extern.getStatusFailed(),targetAction.getActionCode());
            kafka.produceMessageTo(Extern.getTopicFailed(), key, value);
        }
        catch (PendingException e) {
            log.warn("[MS][WARN] CONTRACT({}) HAS PENDING", e.getCoId());
            sendPending(e.getCoId());
        }
        catch (FailedException e){
            log.error("[MS][WARN] FailedException:{}",e.getError());
            sendFailed(e.getError());
        }
        catch (Exception e){
            log.error("[MS][ERROR] In class : " + e.getClass());
            log.error("[MS][ERROR] Exception:{}",e.getMessage());
            sendFailed(e.getMessage());
        }
        log.info("=======================OUTPUT=======================");
    }

    public void setProductAndActionStatus(String status){
        if (targetAction != null) targetAction.setActionProcessedStatus(status);
    }

    public void sendPending(Long coId) {
        setProductAndActionStatus(Extern.getStatusPending());
        sendLog("There's pending request for contract(coId="+ coId +")", Extern.getStatusPending(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicPending(), order.getCommandId(), order.toJson());
    }

    public void sendLog(String des,String status, String actionCode) {
        if (Objects.isNull(des)||  des.equalsIgnoreCase("null")) des = "Internal Micro-Service Error";
        var local = new MicroServiceLogDTO(Extern.getMicroServiceName(),Extern.getTopicThis(),order.getCommandId(),des,status,actionCode);
        kafka.produceMessageTo(Extern.getTopicHistory(), order.getCommandId(), local.toJson());
    }

    public void sendSuccess() {
        kafka.produceMessage(order.getCommandId(), order.toJson());
    }

    public void sendFailed(String failedMessage){
        setProductAndActionStatus(Extern.getStatusFailed());
        sendLog(failedMessage ,Extern.getStatusFailed(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicFailed(), order.getCommandId(), order.toJson());
    }
}
