package com.billcom.addcontract;


import com.billcom.addcontract.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages ={"com.billcom.addcontract"},exclude={MongoAutoConfiguration.class})
@RequiredArgsConstructor
@EnableScheduling
public class AddContractApplication implements CommandLineRunner {

    final ThreadService thread;

    public static void main(String[] args) {
        SpringApplication.run(AddContractApplication.class, args);
    }

    @Override
    public void run(String... args) {
        thread.startNewThread();
    }

}
