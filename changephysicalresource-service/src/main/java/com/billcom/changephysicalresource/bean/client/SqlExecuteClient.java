package com.billcom.changephysicalresource.bean.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SqlExecuteClient {

    private final WebClient rest;

    public SqlExecuteClient(@Value("${rest_url}") String baseUrl
    ){
        this.rest = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

    public Object changePhysicalResource(Integer coId, String newResource) {
        return rest
                .post()
                .uri("/api/contract/changeContractPhysicalResource/" + coId + "?number=" + newResource)
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

}
