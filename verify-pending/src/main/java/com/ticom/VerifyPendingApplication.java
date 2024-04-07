package com.ticom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VerifyPendingApplication {
    public static void main(String[] args) {
        SpringApplication.run(VerifyPendingApplication.class, args);
    }
}
