package com.billcom.createcustomer.exception;

import lombok.Getter;

@Getter
public class FailedException extends Exception{
    final String errorMessage;

    public FailedException(String errorMessage){
        this.errorMessage = errorMessage;
    }

}
