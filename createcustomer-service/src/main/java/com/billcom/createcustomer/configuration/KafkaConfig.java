package com.billcom.createcustomer.configuration;


import com.billcom.createcustomer.bean.Extern;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.StickyAssignor;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class KafkaConfig {
    final Producer<String, String> producer;

    public Properties kafkaStreamConfig(){
        Properties config=new Properties();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, Extern.getKafkaStreamName());
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,Extern.getKafkaServer());
        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        config.put(ConsumerConfig.PARTITION_ASSIGNMENT_STRATEGY_CONFIG, StickyAssignor.class.getName());
        config.put(StreamsConfig.NUM_STANDBY_REPLICAS_CONFIG, 1);
        config.put(StreamsConfig.BUFFERED_RECORDS_PER_PARTITION_CONFIG,1000);
        config.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG,"at_least_once");
        return config;
    }
    public void produceMessage(String key, String value) {
        Extern.getTopicNext().forEach(e -> produceMessageTo(e,key,value));
    }

    public void produceMessageTo(String topic, String key, String value) {
        log.info("[MS][KAFKA] START Producing(Order={}) to topic({}) ",key,topic);
        producer.send(new ProducerRecord<>(topic, key,value));
        producer.flush();
        log.info("[MS][KAFKA] DONE Producing(Order={}) to topic({}) ",key,topic);
    }

    public void produceMessageExc(String key, String value, String topicExc) {
        log.info("[KAFKA][INFO] Producing To Next but({}) ",topicExc);
        Extern.getTopicNext().forEach(topic -> {
            if (!topic.equalsIgnoreCase(topicExc)) produceMessageTo(topic, key, value);
        });
    }

}
