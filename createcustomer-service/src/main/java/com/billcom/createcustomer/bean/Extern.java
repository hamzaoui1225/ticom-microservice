package com.billcom.createcustomer.bean;


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

    //BSCSwS

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


    @Value("${bscsws.timeout}")
    String getBscsWsTimeout;
    @Value("${bscsws.username}")
    String getBscsWsUserName;
    @Value("${bscsws.usersec}")
    String getBscsWsUserSec;
    @Value("${bscsws.password}")
    String getBscsWsPassword;
    @Value("${bscsws.secqname}")
    String getBscsWsSeqName;


    // URLs
    @Getter
    static String urlUpdateCustomer;
    @Getter
    static String urlGetClient;
    @Getter
    static String customerHandlingUrl;
    @Getter
    static String banksSearchUrl;
    @Getter
    static String billingAccountSearchUrl;
    @Getter
    static String billingAccountWriteUrl;
    @Getter
    static String customerTaxExemptionsReadUrl;
    @Getter
    static String customerTaxExemptionsWriteUrl;

    @Value("${url.updateCustomer}")
    String getUrlUpdateCustomer;
    @Value("${url.getClient}")
    String getUrlGetClient;
    @Value("${customerHandling.url}")
    String getCustomerHandlingUrl;
    @Value("${banksSearch.url}")
    String getBanksSearchUrl;
    @Value("${billingAccountSearch.url}")
    String getBillingAccountSearchUrl;
    @Value("${billingAccountWrite.url}")
    String getBillingAccountWriteUrl;
    @Value("${customerTaxExemptionsRead.url}")
    String getCustomerTaxExemptionsReadUrl;
    @Value("${customerTaxExemptionsWrite.url}")
    String getCustomerTaxExemptionsWriteUrl;
    //

    // MICROSERVICE CONFIG
    @Getter
    static String microServiceName;
    @Getter
    static String actionCode1;
    @Getter
    static String actionCode2;
    @Getter
    static String queryGetDealerId;

    @Getter
    static String queryGetPRGCode;
    //
    @Value("${spring.application.name}")
    String getMicroServiceName;
    @Value("${ms.action1}")
    String getActionCode1;
    @Value("${ms.action2}")
    String getActionCode2;
    @Value("${sqlExecutor.queryGetDealerId}")
    String getQueryGetDealerId;
    @Value("${sqlExecutor.queryGetPRGCode}")
    String getGetQueryGetPRGCode;

    // END MICROSERVICE

    //  STATUS
     @Getter
     static String statusFailed;
     @Getter
     static String statusPassed;
    static String statusProcessed;
    //
    @Value("${status.processed}}")
    String getStatusProcessed;
    @Value("${status.failed}")
    String getStatusFailed;
    @Value("${status.passed}")
    String getStatusPassed;

    // END STATUS
   //MONGO
    @Getter
    static String mongoUrl;
    @Getter
    static String mongoDataBaseName;

    @Getter
    static String mongoDocumentGetTopic;

    @Value("${mongo.url}")
    String getMongoUrl;

    @Value("${mongo.database}")
    String getMongoDataBaseName;

    @Value("${mongo.document.gettopic}")
    String getMongoDocumentGetTopic;
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

    // CRM_WS
    @Getter
    static String urlDistributor;
    @Value("${crm.urlDistributor}")
    String getUrlDistributor;

    //
    // TOPICS CONFIG
     @Getter
     static String topicFailed;
     static ArrayList<String> topicNext;
     @Getter
     static String topicThis;
     @Getter
     static String topicHistory;
    //
    @Value("${topic.history}")
    String getTopicHistory;
    @Value("${topic.failed}")
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

    //DEFAULT PARAMS
    @Getter
    static String defaultCountry;
    @Getter
    static String defaultLocality;
    @Getter
    static String defaultDelegation;
    @Getter
    static String defaultGovernorate;
    @Getter
    static Integer defaultStreetType;
    static String defaultStreetName;
    @Getter
    static String defaultPostalCode;
    @Getter
    static String defaultStreetNumber;
    @Getter
    static String defaultBillingPeriod;
    @Getter
    static String defaultPaymentMode;
    @Getter
    static Integer defaultJobTitle;
    @Getter
    static String defaultIndustry;
    @Getter
    static String defaultPreferredContactMethod;
    @Getter
    static String defaultClientType;

    @Value("${country.default}")
    String getDefaultCountry;
    @Value("${locality.default}")
    String getDefaultLocality;
    @Value("${delegation.default}")
    String getDefaultDelegation;
    @Value("${governorate.default}")
    String getDefaultGovernorate;
    @Value("${streetType.default}")
    String getDefaultStreetType;
    @Value("${streetName.default}")
    String getDefaultStreetName;
    @Value("${postalCode.default}")
    String getDefaultPostalCode;
    @Value("${streetNumber.default}")
    String getDefaultStreetNumber;
    @Value("${billingPeriod.default}")
    String getDefaultBillingPeriod;
    @Value("${paymentMode.default}")
    String getDefaultPaymentMode;
    @Value("${jobTitle.default}")
    String getDefaultJobTitle;
    @Value("${industry.default}")
    String getDefaultIndustry;
    @Value("${preferredContactMethod.default}")
    String getDefaultPreferredContactMethod;
    @Value("${clientType.default}")
    String getDefaultClientType;
    @Override
    public synchronized void afterPropertiesSet() {
        // CRM WS
        urlDistributor  = getUrlDistributor;
        //BSCSWS
        bscsWsTimeout = getBscsWsTimeout;
        bscsWsUsername = getBscsWsUserName;
        bscsWsUserSec = getBscsWsUserSec;
        bscsWsPassword = getBscsWsPassword;
        bscsWsSeqName = getBscsWsSeqName;
    // URL
        urlUpdateCustomer = getUrlUpdateCustomer;
        urlGetClient = getUrlGetClient;
        customerHandlingUrl = getCustomerHandlingUrl;
        banksSearchUrl =getBanksSearchUrl;
        billingAccountSearchUrl = getBillingAccountSearchUrl;
        billingAccountWriteUrl = getBillingAccountWriteUrl;
        customerTaxExemptionsReadUrl = getCustomerTaxExemptionsReadUrl;
        customerTaxExemptionsWriteUrl = getCustomerTaxExemptionsWriteUrl;
    // MICROSERVICE
        actionCode1 = getActionCode1;
        actionCode2 = getActionCode2;
        microServiceName = getMicroServiceName;
        queryGetDealerId = getQueryGetDealerId;
        queryGetPRGCode = getGetQueryGetPRGCode;
    // STATUS
        statusPassed = getStatusPassed;
        statusProcessed = getStatusProcessed;
        statusFailed = getStatusFailed;
        // MONGO
        mongoUrl = getMongoUrl;
        mongoDataBaseName = getMongoDataBaseName;
        mongoDocumentGetTopic = getMongoDocumentGetTopic ;
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
    //DEFAULT PARAMS
        defaultCountry =getDefaultCountry;
        defaultDelegation = getDefaultDelegation;
        defaultGovernorate = getDefaultGovernorate;
        defaultLocality = getDefaultLocality;
        defaultStreetType = Integer.valueOf( getDefaultStreetType );
        defaultStreetName = getDefaultStreetName;
        defaultStreetNumber = getDefaultStreetNumber;
        defaultBillingPeriod = getDefaultBillingPeriod;
        defaultIndustry = getDefaultIndustry;
        defaultJobTitle = Integer.valueOf( getDefaultJobTitle );
        defaultPaymentMode = getDefaultPaymentMode;
        defaultPostalCode = getDefaultPostalCode;
        defaultPreferredContactMethod = getDefaultPreferredContactMethod;
        defaultClientType = getDefaultClientType;
    }


    @Bean
    public static String getAllConfig(){
        return "";
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
