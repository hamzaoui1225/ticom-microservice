package com.ticom.exception;
public class FailedException extends Exception {
    String errorMessage;
    String errorCode;
    public FailedException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
    public FailedException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public String getError(){
        if (errorCode != null && !errorCode.isEmpty()) return String.format("[%s]: %s", errorCode, errorMessage);
        return errorMessage;
    }
}
