package com.billcom.changecontractstatus.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FailedException extends Exception {

    final String error;
    public FailedException(String e){
        this.error = e;
    }

}
