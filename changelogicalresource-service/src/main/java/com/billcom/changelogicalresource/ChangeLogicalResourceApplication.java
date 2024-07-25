package com.billcom.changelogicalresource;

import com.billcom.changelogicalresource.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication(scanBasePackages ={"com.billcom.changelogicalresource"},exclude={MongoAutoConfiguration.class})
@EnableEurekaClient
@RequiredArgsConstructor
public class ChangeLogicalResourceApplication implements CommandLineRunner {
    final ThreadService thread;

    public static void main(String[] args) {
        SpringApplication.run(ChangeLogicalResourceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        thread.startNewThread();
    }

}
