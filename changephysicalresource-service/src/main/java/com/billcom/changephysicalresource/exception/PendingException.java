package com.billcom.changephysicalresource.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PendingException extends RuntimeException {

    final String coId;
    public PendingException(String coId){
        this.coId = coId;
    }

}
