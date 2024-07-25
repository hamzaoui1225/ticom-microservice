package com.billcom.createcustomer.bean.client;


import com.billcom.createcustomer.model.mongo.Customer;
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
    public Customer createCustomer(Customer customer) {
        return rest
                .post()
                .uri("/api/customer/createCustomer")
                .body(BodyInserters.fromValue(customer))
                .retrieve()
                .bodyToMono(Customer.class)
                .block();
    }
}
