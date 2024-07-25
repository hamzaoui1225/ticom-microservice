package com.billcom.changecontractstatus.service.interfaces;

import com.billcom.changecontractstatus.exception.FailedException;
import com.billcom.changecontractstatus.exception.sqlexecute.SQLExecuteNotSuccessfulOperationException;
import com.billcom.changecontractstatus.exception.sqlexecute.SQLExecuteSuccessfulNoDataException;
import com.billcom.changecontractstatus.model.mongo.order.ActionsDTO;
import com.billcom.changecontractstatus.model.mongo.order.OrderDTO;
import com.billcom.changecontractstatus.model.mongo.order.product.ProductsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public interface CheckService {

    int getRetention(ProductsDTO product);
    Long getReasons(ProductsDTO product) throws FailedException;
    Long handleGettingReason(ProductsDTO product) throws FailedException;
    String getStringFromObject(Object value) throws JsonProcessingException;
    OrderDTO getOrderFromString(String value) throws JsonProcessingException;
    String getOldContractStatus(String contract);
    void loopThrowProducts(ActionsDTO action) throws FailedException, MalformedURLException, ServiceException, SOAPException, RemoteException;
    void checkForWorks(ActionsDTO action) throws MalformedURLException, ServiceException, SOAPException, RemoteException, FailedException, JsonProcessingException, SQLExecuteSuccessfulNoDataException, SQLExecuteNotSuccessfulOperationException;
    boolean isValidStatus(String actionStatus);
    void loopThrowActions(String value) throws JsonProcessingException, MalformedURLException, ServiceException, SOAPException, RemoteException, FailedException, SQLExecuteSuccessfulNoDataException, SQLExecuteNotSuccessfulOperationException;
    void exceptionHandler(String key, String value);
    void setProductAndActionStatus(String status);
    void sendPending(Long coId);
    void sendLog(String des,String status, String actionCode);
    void sendSuccess();
    void sendFailed(String failedMessage);
}
