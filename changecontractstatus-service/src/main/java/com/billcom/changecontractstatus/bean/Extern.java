package com.billcom.changecontractstatus.bean;


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


    // BSCS-WS CONFIG
    @Getter
    static String bscsWsTimeout;
    @Getter
    static String bscsWsUsername;
    @Getter
    static String bscsWsUserSec;
    @Getter
    static String bscsWsPassword;
    @Getter
    static String bscsWsSeqName;
    static String bscsWsGmdTimeout;
    //

    //  STATUS
    @Getter
    static String statusProcessed;
    @Getter
    static String statusFailed;
    @Getter
    static String statusSuccess;
    @Getter
    static String statusPending;
    @Getter
    static String statusOnHold;
    //
    @Value("${statusonhold}")
    String getStatusOnHold;
    @Value("${statusprocessed}")
    String getStatusProcessed;
    @Value("${statusfailed}")
    String getStatusFailed;
    @Value("${statussuccess}")
    String getStatusSuccess;
    @Value("${statuspending}")
    String getStatusPending;
    // END STATUS


    // MICROSERVICE CONFIG
    @Getter
    static String microServiceName;
    @Value("${spring.application.name}")
    String getMicroServiceName;
    // END MICROSERVICE



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


    // URLs
    @Getter
    static String urlContractWrite;
    @Getter
    static String urlApcHandler;
    @Getter
    static String urlReasonsRead;
    // END URLs

    // ACTIONS
    @Getter
    static String actionDesactivation;
    @Getter
    static String actionActivation;
    @Getter
    static String actionSuspend;
    //
    @Value("${actiondesactivation}")
    String getActionDesactivation;
    @Value("${actionactivation}")
    String getActionActivation;
    @Value("${actionsuspend}")
    String getActionSuspend;
    // END ACTIONS

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
        // MONGO
        mongoUrl = getMongoUrl;
        mongoDocumentGetTopic = getMongoDocumentGetTopic;
        mongoDataBaseName = getMongoDataBaseName;
        // BSCS-WS
        // MICROSERVICE
        microServiceName = getMicroServiceName;
        // ACTION
        actionActivation = getActionActivation;
        actionSuspend = getActionSuspend;
        actionDesactivation = getActionDesactivation;
        // STATUS
        statusProcessed = getStatusProcessed;
        statusPending = getStatusPending;
        statusSuccess = getStatusSuccess;
        statusFailed = getStatusFailed;
        statusOnHold = getStatusOnHold;
        // KAFKA
        kafkaServer = getKafkaServer;
        kafkaStreamName = getKafkaStreamName;
        // TOPICS
        topicFailed = getTopicFailed;
        topicPending = getTopicPending;
        topicHistory = getTopicHistory;
        //
    }

    @Bean
    public static String getAllConfig(){
        return "" ;
    }

    public static void setTopicNext(List<String> topicNext) {
        Extern.topicNext = (ArrayList<String>) topicNext;
    }

    public static void setTopicThis(String topicThis) {
        Extern.topicThis = topicThis;
    }

    public static List<String> getTopicNext() {
        return topicNext;
    }

}
