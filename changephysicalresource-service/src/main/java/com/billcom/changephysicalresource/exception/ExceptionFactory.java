package com.billcom.changephysicalresource.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.AxisFault;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

@Slf4j
@Getter
public class ExceptionFactory extends Exception{

    final String error;
    final String errorCode;
    final String errorMessage;

    final Exception exceptionBucket;

    public ExceptionFactory(String error, String errorCode, String errorMessage, Exception exceptionBucket){
        this.error = error;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.exceptionBucket = exceptionBucket;
    }
    @SneakyThrows
    public ExceptionFactory(Exception exception) {
        String errorMessage1;
        String errorCode1;
        String error1;
        this.exceptionBucket = exception;
        if (exception instanceof JsonProcessingException jsonException){
            error1 = jsonException.getMessage();
            errorCode1 = jsonException.getLocalizedMessage();
            errorMessage1 = jsonException.getOriginalMessage();
        }else if (exception instanceof AxisFault axisFault){
            NodeList fetchError = axisFault.getFaultDetails()[0].getElementsByTagName("alu:faultstring");
            if (fetchError.getLength() > 0) {error1 = fetchError.item(0).getTextContent();}
            else error1 = axisFault.dumpToString();
            errorCode1 = axisFault.getFaultCode().toString();
            errorMessage1 = axisFault.getFaultString();
        }else if (exception instanceof RemoteException remoteException){
            error1 = remoteException.getMessage();
            errorCode1 = remoteException.getLocalizedMessage();
            errorMessage1 = remoteException.getCause().getMessage();
        }else if (exception instanceof FailedException failedException){
            error1 = failedException.getError();
            errorCode1 = failedException.getCause().getMessage();
            errorMessage1 = failedException.getLocalizedMessage();
        }else if (exception instanceof MalformedURLException urlException){
            error1 = urlException.getMessage();
            errorCode1 = urlException.getCause().getMessage();
            errorMessage1 = urlException.getLocalizedMessage();
        }else if (exception instanceof SOAPException soapException){
            error1 = soapException.getMessage();
            errorCode1 = soapException.getCause().getMessage();
            errorMessage1 = soapException.getLocalizedMessage();
        }else if (exception instanceof WebClientResponseException webClientResponseException){
            error1 = webClientResponseException.getMessage();
            errorCode1 = String.valueOf(webClientResponseException.getRawStatusCode());
            errorMessage1 = webClientResponseException.getStatusText();
        }else{
            try {
                error1 = exists(exception.getMessage());
                errorCode1 = exists(exception.getMessage().substring(0,Math.min(exception.getMessage().length(),100)));
                errorMessage1 = exists(exception.getMessage().substring(0,Math.min(exception.getMessage().length(),100)));
                log.info(exception.getClass().getName());
            } catch (Exception e) {
              error1 = "Internal Error while catching error check logs";
              errorCode1 = "500";
              errorMessage1 = "Internal Error while catching error check logs";
              log.error(exception.getMessage());
            }
        }
        log.error("[{}] {} \n {} \n Error Class: {}",errorCode1,error1,errorMessage1,exception.getClass().getName());
        this.errorMessage = errorMessage1;
        this.errorCode = errorCode1;
        this.error = error1;
    }

    private String exists(String testString){
        return (testString == null || testString.isEmpty()) ? "" : testString;
    }


}
