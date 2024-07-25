package com.billcom.changephysicalresource;

import com.billcom.changephysicalresource.service.ThreadService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication(scanBasePackages ={"com.billcom.changephysicalresource"})
@RequiredArgsConstructor
public class ChangePhysicalResourceApplication implements CommandLineRunner {

    final ThreadService thread;

    public static void main(String[] args) {
        SpringApplication.run(ChangePhysicalResourceApplication.class,args);
    }

    @Override
    public void run(String... args) {
        thread.startNewThread();
    }
}
