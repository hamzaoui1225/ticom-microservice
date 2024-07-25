package com.billcom.addcontract.exception;

import lombok.Getter;

@Getter
public class FailedException extends RuntimeException{
    final String errorMessage;

    public FailedException(String errorMessage){
        this.errorMessage = errorMessage;
    }

}
