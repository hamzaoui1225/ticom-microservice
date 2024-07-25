package com.billcom.changelogicalresource.bean.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class DataBaseClient {

    private final WebClient rest;

    public DataBaseClient(@Value("${rest_url}") String baseUrl){
        this.rest = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

    public Object changeContractResource(Integer coId, Integer number){
        return rest
                .post()
                .uri("/api/contract/changeContractLogicalResource/" + coId + "?number=" + number)
                .retrieve()
                .bodyToMono( Object.class)
                .block();
    }

}
