package com.billcom.changecontractstatus.bean.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class DataBaseClient {

    private final WebClient rest;

    public DataBaseClient(@Value("${rest.database}") String baseUrl){
        this.rest = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public Object changeContractStatus(Integer coId, String status) {
        return rest
                .post()
                .uri("/api/contract/changeContractStatus/" + coId + "?status=" + status)
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

}
