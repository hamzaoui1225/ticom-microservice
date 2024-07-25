package com.billcom.createcustomer.service.impl;

import com.billcom.createcustomer.bean.Extern;
import com.billcom.createcustomer.configuration.KafkaConfig;
import com.billcom.createcustomer.model.mongo.OrderProcessHistoryDTO;
import com.billcom.createcustomer.model.mongo.order.OrderDTO;
import com.billcom.createcustomer.model.mongo.order.action.ActionsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
@Slf4j
@Service
@RequiredArgsConstructor
public class CreateCustomerServiceImp {

    final KafkaConfig kafka;

    OrderDTO order ;
    ActionsDTO targetAction;

    public OrderDTO getOrderDTO(String value) throws JsonProcessingException {
        return new ObjectMapper().readValue(value, OrderDTO.class);
    }


    public void checkCreateCustomer(String key, String value){
        log.info("=======================INPUT=======================");
        try {
            log.info( "[MS][INFO] START CONVERTING JSON..." );
            order = getOrderDTO(value);
            log.info("[MS][INFO] ORDER IN INPUT({})", order.toJson());
            targetAction=order.getActions().get( 0 );
            log.info( "[MS][INFO] DONE CONVERTING JSON({}).", order.getCommandId( ) );
            order.setTopic(Extern.getTopicThis());

            List<ActionsDTO> workAction = order.getActions().stream().filter(action -> action.getActionCode() != null && (action.getActionCode().equalsIgnoreCase(Extern.getActionCode1().toLowerCase()) || action.getActionCode().equalsIgnoreCase(Extern.getActionCode2())) ).toList();

          //  checkForActions(workAction);

            sendSuccessful();
        } catch (JsonProcessingException e){
            sendFailed( "Infected JSON " );
        } catch (Exception e) {
            handleError(e);
        }
        log.info("=======================OUTPUT=======================");
    }

    public void validateRquiredInputs(){
        //clientStatus
        //Adress (country, postCode,streetName,town, length adrStreet(streetType+streetName+subAdressType+floor),length(country =3),
        // length adress district =40,
        // length floor =40,
        // length adress lot =15,
        // length adress province =25,
        // length streetName=40,
        // length town=40,
        // contactInformation(length and valid(characteres)  email=200,length fax=25),
        //if ! null paymentInformation(paymentMode) if ! null bankInformation( =null and length =25 bankAccountNumber,interBankZones,bankAccountOwner=40,
        // length inter Zones =20,
        //if ! = null creditCardInformation(creditCardCompanyName=null,creditCardNumber=null,ExpirationMMYY,creditCardAccountOwner=40,ExpirationMMYY=4) ))
        // if ! null personalData(billcycle=null=2,clientType=null,generalInformation=null(companyName=40),if ! null dealer(dealerId=0,),
        // if personName!=null(firstName=null=40,lastName=null=40,title=null,)
        // if campanyInfo ! =  null (companyRegistrationNumber=20,taxRegistrationNumber=20))


    }
    private void handleError(Exception e) {
        String exceptionMessage = e.toString();
        String shortMessage = exceptionMessage.substring(0, Math.min(exceptionMessage.length(), 200));
        log.error("[MS][ERROR] Message Log ::{}", shortMessage);
        log.error("[MS][ERROR] Exception caused by({})", shortMessage, e);
        sendFailed(exceptionMessage);
    }
    public void sendSuccessful(){
        order.setRetryFailed(null);
        log.info("[MS][INFO] SENDING ORDER({}) TO THE NEXT TOPICS.",order.getCommandId());
        kafka.produceMessage( order.getCommandId(),order.toJson() );
    }

    public void sendFailed(String error){
        if (targetAction != null) targetAction.setActionProcessedStatus(Extern.getStatusFailed());
        log.info("[MS][INFO] SENDING ORDER({}) TO FAILED TOPIC({})",order.getCommandId(),Extern.getTopicFailed());
        log.error("[MS][ERROR] FAILED : " + error);
        sendToOrderProcHist(error,Extern.getStatusFailed(),targetAction==null ? null : targetAction.getActionCode( ) );
        kafka.produceMessageTo(Extern.getTopicFailed(), order.getCommandId(), order.toJson());
    }

    public void sendToOrderProcHist(String des,String status,String actionCode){
        if (Objects.isNull(des)||  des.equalsIgnoreCase("null")) des = "Internal Micro-Service Error";
        log.info("[MS][INFO] LOGOUT {DES: " + des + " ,STATUS: " + status + "}");
        var local = new OrderProcessHistoryDTO(Extern.getMicroServiceName(),Extern.getTopicThis(), order.getCommandId(),des,status,actionCode);
        kafka.produceMessageTo(Extern.getTopicHistory(), order.getCommandId(),local.toString());
    }
}
