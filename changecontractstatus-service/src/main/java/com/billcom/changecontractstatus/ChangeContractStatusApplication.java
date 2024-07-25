package com.billcom.changecontractstatus;

import com.billcom.changecontractstatus.bean.client.DataBaseClient;
import com.billcom.changecontractstatus.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableEurekaClient
@SpringBootApplication(scanBasePackages ={"com.billcom.changecontractstatus"})
@RequiredArgsConstructor
public class ChangeContractStatusApplication implements CommandLineRunner {

    final ThreadService thread;
    final DataBaseClient client;
    public static void main(String[] args) {
       SpringApplication.run(ChangeContractStatusApplication.class, args);
     }

    @Override
    public void run(String... args) {
        thread.startNewThread();
    }
}

