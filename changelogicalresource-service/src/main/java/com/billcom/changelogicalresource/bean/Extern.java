package com.billcom.changelogicalresource.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("externConfig")
@AllArgsConstructor
public class Extern implements InitializingBean {



    // MICROSERVICE CONFIG
     @Getter
     static String microserviceName;
     @Getter
     static String actionMsisdnSwap;


    //
    @Value("${spring.application.name}")
    String getMicroserviceName;
    @Value("${msaction}")
    String getActionMsisdnSwap;


    // END MICROSERVICE

    //  STATUS
     @Getter
     static String statusProcessed;
     @Getter
     static String statusFailed;
     @Getter
     static String statusSuccess;
     @Getter
     static String statusPending;
    //
    @Value("${statusprocessed}")
    String getStatusProcessed;
    @Value("${statusfailed}")
    String getStatusFailed;
    @Value("${statussuccess}")
    String getStatusSuccess;
    @Value("${statuspending}")
    String getStatusPending;

    // END STATUS


    // KAFKA CONFIG
     @Getter
     static String kafkaServer;
     @Getter
     static String kafkaStreamName;
    //
    @Value("${bootstrap.servers}")
    String getKafkaServer;
    @Value("${kafka.stream.name}")
    String getKafkaStreamName;
    // END KAFKA


    // THREAD CONFIG
     @Getter
     static String threadCorepoolsize;
     @Getter
     static String threadMaxpoolsize;
     @Getter
     static String threadQueuecapacity;
    //
    @Value("${thread.corepoolsize}")
    String getThreadCorepoolsize;
    @Value("${thread.maxpoolsize}")
    String getThreadMaxpoolsize;
    @Value("${thread.queuecapacity}")
    String getThreadQueuecapacity;
    // END THREAD


    // TOPICS CONFIG
     @Getter
     static String topicFailed;
     @Getter
     static String topicPending;
     static ArrayList<String> topicNext;
     @Getter
     static String topicThis;
     @Getter
     static String topicHistory;
    //
    @Value("${topichistory}")
    String getTopicHistory;
    @Value("${topicfailed}")
    String getTopicFailed;
    @Value("${topicpending}")
    String getTopicPending;
    //END TOPIC CONFIG


    // SWAGGER CONFIG
     @Getter
     static String swaggerVersion;
     @Getter
     static String swaggerTitle;
     @Getter
     static String swaggerDescription;
     @Getter
     static String swaggerLicense;
     @Getter
     static String swaggerLicenseUrl;
    //
    @Value("${swagger.version}")
    String getSwaggerVersion;
    @Value("${swagger.title}")
    String getSwaggerTitle;
    @Value("${swagger.description}")
    String getSwaggerDescription;
    @Value("${swagger.licenseName}")
    String getSwaggerLicense;
    @Value("${swagger.licenceUrl}")
    String getSwaggerLicenseUrl;
    // END SWAGGER


    // MONGO-DB
    @Getter
    static String mongoUrl;
    @Getter
    static String mongoDataBaseName;
    @Getter
    static String mongoDocumentGetTopic;
    //
    @Value("${mongo.url}")
    String getMongoUrl;
    @Value("${mongo.database}")
    String getMongoDataBaseName;
    @Value("${mongo.document.gettopic}")
    String getMongoDocumentGetTopic;
    // END MONGO-DB
    @Getter
    static String requestChangeResourceStatus;

    @Override
    public synchronized void afterPropertiesSet() {
        // MONGO
        mongoUrl = getMongoUrl;
        mongoDocumentGetTopic = getMongoDocumentGetTopic;
        mongoDataBaseName = getMongoDataBaseName;
        // MICROSERVICE
        actionMsisdnSwap = getActionMsisdnSwap;
        microserviceName = getMicroserviceName;
        // STATUS
        statusProcessed = getStatusProcessed;
        statusPending = getStatusPending;
        statusSuccess = getStatusSuccess;
        statusFailed = getStatusFailed;
        // KAFKA
        kafkaServer = getKafkaServer;
        kafkaStreamName = getKafkaStreamName;
        // THREAD
        threadCorepoolsize = getThreadCorepoolsize;
        threadMaxpoolsize = getThreadMaxpoolsize;
        threadQueuecapacity = getThreadQueuecapacity;
        // TOPICS
        topicFailed = getTopicFailed;
        topicPending = getTopicPending;
        topicHistory = getTopicHistory;
        // SWAGGER
        swaggerVersion = getSwaggerVersion;
        swaggerTitle = getSwaggerTitle;
        swaggerDescription = getSwaggerDescription;
        swaggerLicense = getSwaggerLicense;
        swaggerLicenseUrl = getSwaggerLicenseUrl;
        //
    }

    public static void setTopicThis(String topicThis) {
        Extern.topicThis = topicThis;
    }

    public static void setTopicNext(List<String> topicNext) {
        Extern.topicNext = (ArrayList<String>) topicNext;
    }
    public static List<String> getTopicNext() {
        return topicNext;
    }

    @Bean
    public static String getAllConfig(){
        return "";
    }

}
