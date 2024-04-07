package com.ticom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BrainApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrainApplication.class, args);
    }
}
