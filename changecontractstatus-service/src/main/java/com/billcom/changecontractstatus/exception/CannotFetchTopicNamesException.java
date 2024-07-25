package com.billcom.changecontractstatus.exception;


public class CannotFetchTopicNamesException extends RuntimeException{

    public CannotFetchTopicNamesException(String error){
        super(error);
    }
}
