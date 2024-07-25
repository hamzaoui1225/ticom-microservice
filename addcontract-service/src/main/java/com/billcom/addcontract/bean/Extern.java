package com.billcom.addcontract.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("externConfig")
@AllArgsConstructor
public class Extern implements InitializingBean {


    //  STATUS
    @Getter
    static String statusProcessed;
    @Getter
    static String statusFailed;
    @Getter
    static String statusSuccess;

    @Getter
    static String statusActive;

    //
    @Value("${statusprocesssed}")
    String getStatusProcessed;
    @Value("${statusfailed}")
    String getStatusFailed;
    @Value("${statussuccess}")
    String getStatusSuccess;
    @Value("${statusactive}")
    String getStatusActive;
    // END STATUS




    // END URL

    // MICROSERVICE CONFIG
    @Getter
    static String microServiceName;
    @Getter
    static String actionAddContract;
    @Getter
    static String itemSubTypePlan;
    @Getter
    static String itemSubTypeOPT;
    @Getter
    static String itemSubTypeBS;
    @Getter
    static String prmTypeDB;
    @Getter
    static String prmTypeBOX;
    @Getter
    static String itemType;
    @Getter
    static String subClassMobile;
    @Getter
    static String subClassInternet;
    @Getter
    static String subClassFixe;
    @Getter
    static String subMarketGSM;
    @Getter
    static String subMarketFlybox;
    @Getter
    static String resourceTypeLRS;
    @Getter
    static String resourceTypePRS;
    @Getter
    static Integer seqNo;
    @Getter
    static String serviceId;
    @Getter
    static String productDesRecharge;
    //
    @Value("${spring.application.name}")
    String getMicroServiceName;
    @Value("${msaction}")
    String getActionAddContract;



    // KAFKA CONFIG
    @Getter
    static String kafkaServer;
    @Getter
    static String kafkaStreamName;
    //
    @Value("${bootstrap.servers}")
    String getKafkaServer;
    @Value("${stream.groupid}")
    String getKafkaStreamName;
    // END KAFKA


    // THREAD CONFIG
    @Getter
    static String threadCorePoolSize;
    @Getter
    static String threadMaxPoolSize;
    @Getter
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
    @Getter
    static String topicFailed;
    @Getter
    static List<String> topicNext;
    @Getter
    static String topicThis;
    @Getter
    static String topicHistory;
    //
    @Value("${topichistory}")
    String getTopicHistory;
    @Value("${topicfailed}")
    String getTopicFailed;
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
    @Value("${swagger.license}")
    String getSwaggerLicense;
    @Value("${swagger.licenseurl}")
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


    @Override
    public synchronized void afterPropertiesSet() {
        // STATUS
        statusProcessed = getStatusProcessed;
        statusSuccess = getStatusSuccess;
        statusFailed = getStatusFailed;
        statusActive = getStatusActive;
        // MICROSERVICE
        actionAddContract = getActionAddContract;
        microServiceName = getMicroServiceName;
        // MONGO
        mongoUrl = getMongoUrl;
        mongoDocumentGetTopic = getMongoDocumentGetTopic;
        mongoDataBaseName = getMongoDataBaseName;
        // KAFKA
        kafkaServer = getKafkaServer;
        kafkaStreamName = getKafkaStreamName;
        // THREAD
        threadCorePoolSize = getThreadCorePoolSize;
        threadMaxPoolSize = getThreadMaxPoolSize;
        threadQueueCapacity = getThreadQueueCapacity;
        // TOPICS
        topicFailed = getTopicFailed;
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
        return "All Config :)";
    }

    public static void setTopicNext(List<String> topicNext) {
        Extern.topicNext = topicNext;
    }

    public static void setTopicThis(String topicThis) {
        Extern.topicThis = topicThis;
    }

}
