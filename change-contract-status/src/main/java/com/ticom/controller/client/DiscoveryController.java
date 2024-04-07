package com.ticom.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client/discovery")
public class DiscoveryController {

    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;

    @GetMapping("/verify")
    Object getVerify(){
        return restTemplate.getForObject("http://verify_pending/pending/check", String.class);
    }

}
