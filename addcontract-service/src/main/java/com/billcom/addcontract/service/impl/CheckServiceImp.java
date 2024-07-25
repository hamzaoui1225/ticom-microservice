package com.billcom.addcontract.service.impl;

import com.billcom.addcontract.bean.DataBaseClient;
import com.billcom.addcontract.bean.Extern;
import com.billcom.addcontract.configuration.KafkaConfig;
import com.billcom.addcontract.exception.FailedException;
import com.billcom.addcontract.model.mongo.ContractRequest;
import com.billcom.addcontract.model.mongo.OrderProcessHistoryDTO;
import com.billcom.addcontract.model.mongo.order.OrderDTO;
import com.billcom.addcontract.model.mongo.order.action.ActionsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.AxisFault;
import org.springframework.stereotype.Service;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class CheckServiceImp {

    final KafkaConfig kafka;
    final DataBaseClient database;
    OrderDTO order;

    private ActionsDTO targetAction;


    public static OrderDTO getOrderDTO(String value) throws IOException {
        return new ObjectMapper().readValue(value, OrderDTO.class);
    }

    public void checkAddContract(String key, String value) {
        log.info("=======================INPUT=======================");
        try {
            log.info("[MS][DEBUG] START CONVERTING JSON...");
            order = getOrderDTO(value);
            log.info("[MS][INFO] ORDER IN INPUT({})", order.toJson());
            log.info("[MS][DEBUG] DONE CONVERTING JSON({}).", order.getCommandId());
            order.setTopic(Extern.getTopicThis());
            log.info("[MS][DEBUG] START LOOPING THROW ACTIONS({})...", order.getActions().size());
            for (ActionsDTO action : order.getActions()) {
                targetAction = action;
                checkForWorks(action);
                targetAction = null;
            }
            log.info("[MS][DEBUG] DONE LOOPING THROW ACTIONS.");

            sendSuccessful();
        } catch (JsonProcessingException e) {
            log.error("[MS][ERROR] Infected JSON({})", e.getMessage());
            logOut("Infected JSON " + e.getMessage(), Extern.getStatusFailed(), null);
            kafka.produceMessageTo(Extern.getTopicFailed(), key, value);
        } catch (FailedException e) {
            log.error("[MS][WARN] FailedException:{}", e.getErrorMessage());
            sendFailed(e.getErrorMessage());
        } catch (AxisFault e) {
            String error = e.getFaultString() + " Caused By : ";
            NodeList fetchError = e.getFaultDetails()[0].getElementsByTagName("alu:faultstring");
            if (fetchError.getLength() > 0) {
                error = fetchError.item(0).getTextContent();
            } else error += e.dumpToString();
            log.error("[MS][WARN] AxisFault:{}", error);
            sendFailed(error);
        } catch (RemoteException e) {
            log.debug("[MS][DEBUG] REMOTE Exception:{}", e.getMessage());
            String x = e.toString();
            String exc = x.substring(0, Math.min(x.length(), 100));
            log.error("[MS][ERROR] CONNECTION RELATED ERROR: " + e + "\n CAUSED BY :" + e.getCause());
            sendFailed(exc);
        } catch (Exception e) {
            log.error("[MS][ERROR] Exception:{}", e.getMessage());
            String x = e.toString();
            String exc = x.substring(0, Math.min(x.length(), 150));
            log.error("Message Log ::" + exc);
            sendFailed(x);
        }
        log.info("=======================OUTPUT=======================");
    }

    private void checkForWorks(ActionsDTO action) throws RemoteException, JsonProcessingException {
        if (action.getActionCode().equalsIgnoreCase(Extern.getActionAddContract().toLowerCase())) {
            loopThrowProduct(action);
            action.setActionProcessedStatus(Extern.getStatusProcessed());
            order.setRetryFailed(null);
        }
    }


    public void loopThrowProduct(ActionsDTO action) {
        log.info("[MS][INFO] START LOOPING THROW PRODUCTS under ({})...", action.getActionCode());

        log.info("[MS][INFO] START Checking for CUSTOMER_ID... ");
        Integer customerId = Integer.parseInt(order.getCustomerInfo().getCustNum());
        String physical = action.getResourceSpec().getPhysicalResource().get(0).getValue();
        Integer logical = Integer.parseInt(action.getResourceSpec().getLogicalResource().get(0).getValue());
        String market = action.getContractSpec().getMarket();
        String subMarket = action.getContractSpec().getSubMarket();

        var res = database.createContract(
                ContractRequest.builder()
                        .customerId(customerId)
                        .logical(logical)
                        .physical(physical)
                        .market(market)
                        .subMarket(subMarket)
                        .build()
        );
        log.info("[MS][INFO] DONE CREATING CONTRACT Successful CoId({}), CoIdPub({}).", res.getCoId(), res.getCustomerId());
        logOut("Contract Created Successfully with (ContractID=" + res.getCoId() + ")", Extern.getStatusSuccess(), action.getActionCode());

    }


    public void sendSuccessful() {
        log.info("[MS][INFO] SENDING IT TO THE NEXT TOPICS.");
        kafka.produceMessage(order.getCommandId(), order.toJson());
    }

    public void sendFailed(String error) {
        log.error("[MS][ERROR] FAILED : " + error);
        setProductAndActionStatus(Extern.getStatusFailed());
        logOut(error, Extern.getStatusFailed(), targetAction.getActionCode());
        kafka.produceMessageTo(Extern.getTopicFailed(), order.getCommandId(), order.toJson());
    }

    public void logOut(String des, String status, String actionCode) {
        if (Objects.isNull(des) || des.equalsIgnoreCase("null")) des = "Internal Micro-Service Error";
        log.info("[MS][INFO] LOGOUT {DES: " + des + " ,STATUS: " + status + "}");
        OrderProcessHistoryDTO local = new OrderProcessHistoryDTO(Extern.getMicroServiceName(), Extern.getTopicThis(), order.getCommandId(), des, status, actionCode);
        kafka.produceMessageTo(Extern.getTopicHistory(), order.getCommandId(), local.toString());
    }

    private void setProductAndActionStatus(String status) {
        if (targetAction != null) targetAction.setActionProcessedStatus(status);
    }

}
