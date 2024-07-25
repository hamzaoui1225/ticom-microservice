package com.billcom.changelogicalresource.exceptions;

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
