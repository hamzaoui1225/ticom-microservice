package com.billcom.changecontractstatus.exception;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PendingException extends RuntimeException {

    final Long coId;

    public PendingException(Long coId){
        this.coId = coId;
    }

}
