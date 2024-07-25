package com.billcom.createcustomer;


import com.billcom.createcustomer.service.ThreadService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(scanBasePackages ={"com.billcom.createcustomer"},exclude={MongoAutoConfiguration.class})
@RequiredArgsConstructor
public class CreateCustomerApplication implements CommandLineRunner{

    final ThreadService thread;

    @Override
    public void run(String... args) {
        thread.startNewThread();
    }

    public static void main(String[] args) {
        SpringApplication.run( CreateCustomerApplication.class,args);
    }

}
