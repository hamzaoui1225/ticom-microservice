package com.ticom.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/config")
public class RefreshAllMicroServiceController {

    @Value("${spring.application.name}")
    String myName;

    final DiscoveryClient eureka;

    @PostMapping("/refresh")
    ResponseEntity<List<String>> refreshMicroServicesConfig(){
        List<String> msDone = new ArrayList<>();
        for (String service : eureka.getServices()) {
            for (ServiceInstance microServiceInstance : eureka.getInstances(service)) {
                if (microServiceInstance.getServiceId().equalsIgnoreCase(myName)) continue;
                log.info("[Refresh] {}", microServiceInstance.getServiceId());
                log.info("[Refresh] calling [POST] http://{}:{}/actuator/refresh for {}", microServiceInstance.getHost(),  microServiceInstance.getPort(), microServiceInstance.getServiceId());
                var response = WebClient.create("http://" + microServiceInstance.getHost() + ":" + microServiceInstance.getPort() + "/actuator/refresh")
                                        .post()
                                        .retrieve()
                                        .bodyToMono(List.class)
                                        .onErrorComplete()
                                        .block();
                if ((response != null) && (!response.isEmpty())) msDone.add(microServiceInstance.getServiceId());
            }
        }
        return ResponseEntity.ok(msDone);
    }

}
