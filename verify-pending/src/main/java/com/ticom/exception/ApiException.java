package com.ticom.exception;

import com.ticom.models.api.ApiResponse;
import org.apache.axis.AxisFault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.SocketTimeoutException;
import java.rmi.RemoteException;

@RestControllerAdvice
public class ApiException {

    @ExceptionHandler(value = {SocketTimeoutException.class})
    @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
    public ApiResponse resourceNotFoundException(SocketTimeoutException ex) {
        return ApiResponse.builder()
                .message(ex.getMessage())
                .isSuccessful(false)
                .build();
    }

    @ExceptionHandler(value = {ServiceException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse resourceNotFoundException(ServiceException ex) {
        return ApiResponse.builder()
                .message(ex.getMessage())
                .isSuccessful(false)
                .build();
    }
    @ExceptionHandler(value = {AxisFault.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse resourceNotFoundException(AxisFault ex) {
        return ApiResponse.builder()
                .message(ex.getFaultString())
                .isSuccessful(false)
                .build();
    }

    @ExceptionHandler(value = {SOAPException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse resourceNotFoundException(SOAPException ex) {
        return ApiResponse.builder()
                .message(ex.getMessage())
                .isSuccessful(false)
                .build();
    }
    @ExceptionHandler(value = {RemoteException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse resourceNotFoundException(RemoteException ex) {
        return ApiResponse.builder()
                .message(ex.getMessage())
                .isSuccessful(false)
                .build();
    }
    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse resourceNotFoundException(Exception ex) {
        return ApiResponse.builder()
                .message(ex.getMessage())
                .isSuccessful(false)
                .build();
    }

}
