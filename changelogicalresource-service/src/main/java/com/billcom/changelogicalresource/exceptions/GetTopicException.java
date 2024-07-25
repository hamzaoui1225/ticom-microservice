package com.billcom.changelogicalresource.exceptions;

public class GetTopicException extends RuntimeException{
    public GetTopicException(){
        super("[MS][MONGO][WARN] CANNOT FIND TOPICS TO WORK WITH .");
    }

}
