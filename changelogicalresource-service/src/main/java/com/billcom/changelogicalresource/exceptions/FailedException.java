package com.billcom.changelogicalresource.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FailedException extends RuntimeException{

    final String error;
    public FailedException(String e){
        this.error = e;
    }

}
