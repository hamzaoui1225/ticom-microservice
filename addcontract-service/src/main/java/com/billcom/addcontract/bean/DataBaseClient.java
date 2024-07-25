package com.billcom.addcontract.bean;

import com.billcom.addcontract.model.mongo.Contract;
import com.billcom.addcontract.model.mongo.ContractRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class DataBaseClient {

    private final WebClient rest;

    public DataBaseClient(@Value("${rest_url}") String baseUrl
    ){
        this.rest = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

    public Contract createContract(ContractRequest createContract) {
        return rest
                .post()
                .uri("/api/contract/createContract")
                .body(BodyInserters.fromValue(createContract))
                .retrieve()
                .bodyToMono(Contract.class)
                .block();
    }

}
