package com.billcom.changephysicalresource.bean;


import lombok.AllArgsConstructor;
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
    static String microServiceName;
    static String actionImsiSwap;
    //
    @Value("${spring.application.name}")
    String getMicroServiceName;
    @Value("${msaction}")
    String getActionImsiSwap;
    // END MICROSERVICE

    //  STATUS
     static String statusProcessed;
     static String statusFailed;
     static String statusSuccess;
     static String statusPending;
    //
    @Value("${statusprocesssed}")
    String getStatusProcessed;
    @Value("${statusfailed}")
    String getStatusFailed;
    @Value("${statussuccess}")
    String getStatusSuccess;
    @Value("${statuspending}")
    String getStatusPending;

    // END STATUS


    // KAFKA CONFIG
    static String kafkaServer;
    static String kafkaStreamName;
    //
    @Value("${bootstrap.servers}")
    String getKafkaServer;
    @Value("${stream.groupid}")
    String getKafkaStreamName;
    // END KAFKA


    // THREAD CONFIG
    static String threadCorePoolSize;
    static String threadMaxPoolSize;
    static String threadQueueCapacity;
    //
    @Value("${thread.corepoolsize}")
    String getThreadCorePoolSize;
    @Value("${thread.maxpoolsize}")
    String getThreadMaxPoolSize;
    @Value("${thread.queuecapacity}")
    String getThreadQueueCapacity;
    // END THREAD


    // TOPICS CONFIG
     static String topicFailed;
     static String topicPending;
     static ArrayList<String> topicNext;
     static String topicThis;
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
    static String swaggerVersion;
    static String swaggerTitle;
    static String swaggerDescription;
    static String swaggerLicense;
    static String swaggerLicenseUrl;
    //
    @Value("${swagger.version}")
    String getSwaggerVersion;
    @Value("${swagger.title}")
    String getSwaggerTitle;
    @Value("${swagger.description}")
    String getSwaggerDescription;
    @Value("${swagger.license}")
    String getSwaggerLicense;
    @Value("${swagger.licenseurl}")
    String getSwaggerLicenseUrl;
    // END SWAGGER


    // MONGO-DB
    static String mongoUrl;
    static String mongoDataBaseName;
    static String mongoDocumentGetTopic;
    //
    @Value("${mongo.url}")
    String getMongoUrl;
    @Value("${mongo.database}")
    String getMongoDataBaseName;
    @Value("${mongo.document.gettopic}")
    String getMongoDocumentGetTopic;
    // END MONGO-DB

    @Override
    public synchronized void afterPropertiesSet() {
        // MONGO
        mongoUrl = getMongoUrl;
        mongoDocumentGetTopic = getMongoDocumentGetTopic;
        mongoDataBaseName = getMongoDataBaseName;
        // MICROSERVICE
        actionImsiSwap = getActionImsiSwap;
        microServiceName = getMicroServiceName;
        // STATUS
        statusProcessed = getStatusProcessed;
        statusPending = getStatusPending;
        statusSuccess = getStatusSuccess;
        statusFailed = getStatusFailed;
        // KAFKA
        kafkaServer = getKafkaServer;
        kafkaStreamName = getKafkaStreamName;
        // THREAD
        threadCorePoolSize = getThreadCorePoolSize;
        threadMaxPoolSize = getThreadMaxPoolSize;
        threadQueueCapacity = getThreadQueueCapacity;
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


    @Bean
    public static String getAllConfig(){
        return "";
    }

    public static String getMongoUrl() {
        return mongoUrl;
    }

    public static String getMongoDataBaseName() {
        return mongoDataBaseName;
    }

    public static String getMongoDocumentGetTopic() {
        return mongoDocumentGetTopic;
    }

    public static void setTopicNext(List<String> topicNext) {
        Extern.topicNext = (ArrayList<String>) topicNext;
    }

    public static void setTopicThis(String topicThis) {
        Extern.topicThis = topicThis;
    }

    public static String getMicroServiceName() {
        return microServiceName;
    }

    public static String getActionImsiSwap() {
        return actionImsiSwap;
    }

    public static String getStatusProcessed() {
        return statusProcessed;
    }

    public static String getStatusFailed() {
        return statusFailed;
    }

    public static String getStatusSuccess() {
        return statusSuccess;
    }

    public static String getStatusPending() {
        return statusPending;
    }

    public static String getKafkaServer() {
        return kafkaServer;
    }

    public static String getKafkaStreamName() {
        return kafkaStreamName;
    }

    public static String getThreadCorePoolSize() {
        return threadCorePoolSize;
    }

    public static String getThreadMaxPoolSize() {
        return threadMaxPoolSize;
    }

    public static String getThreadQueueCapacity() {
        return threadQueueCapacity;
    }

    public static String getTopicFailed() {
        return topicFailed;
    }

    public static String getTopicPending() {
        return topicPending;
    }


    public static List<String> getTopicNext() {
        return topicNext;
    }

    public static String getTopicThis() {
        return topicThis;
    }

    public static String getTopicHistory() {
        return topicHistory;
    }

    public static String getSwaggerVersion() {
        return swaggerVersion;
    }

    public static String getSwaggerTitle() {
        return swaggerTitle;
    }

    public static String getSwaggerDescription() {
        return swaggerDescription;
    }

    public static String getSwaggerLicense() {
        return swaggerLicense;
    }

    public static String getSwaggerLicenseUrl() {
        return swaggerLicenseUrl;
    }
}
