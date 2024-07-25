package com.billcom.changelogicalresource.configuration;

import com.billcom.changelogicalresource.bean.Extern;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.StickyAssignor;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@Slf4j
public class KafkaConfig {

    final Producer<String, String> producer;

    public KafkaConfig(Producer<String, String> producer) {
        this.producer = producer;
    }

    /**
     * Configures the properties for the Kafka stream processing application.
     * A unique identifier for the Kafka stream processing application .
     *                    Example properties:
     *                    - bootstrap.servers: A list of host/port pairs to use for establishing the initial connection to the Kafka cluster.
     *                    - default.key.serde.class: The class name of the default key serde for the stream processing application.
     *                    - default.value.serde.class: The class name of the default value serde for the stream processing application.
     *                    - num.standby.replicas: The number of standby replicas for the Kafka stream processing application.
     *                    - buffered.records.per.partition: The maximum number of buffered records per partition in the Kafka stream processing application Default: 1000.
     *                    - processing.guarantee: The processing guarantee for the Kafka stream processing application, such as "at_least_once" or "exactly_once".
     *
     * @return A new instance of KafkaStreamConfig with the specified configuration properties.
     */

    public Properties kafkaStreamConfig(){
        Properties config=new Properties();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, Extern.getKafkaStreamName() );
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,Extern.getKafkaServer() );
        config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        config.put(ConsumerConfig.PARTITION_ASSIGNMENT_STRATEGY_CONFIG, StickyAssignor.class.getName());
        config.put(StreamsConfig.NUM_STANDBY_REPLICAS_CONFIG, 1);
        config.put(StreamsConfig.BUFFERED_RECORDS_PER_PARTITION_CONFIG,1000);
        config.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG,"at_least_once");
        return config;
    }



    /**
     * Produces a message to ta Kafka topic with the given key and value.
     * @param key The key of the message.
     * @param value The value of the message.
     */
    public void produceMessage(String key, String value) {
        Extern.getTopicNext().forEach( e -> produceMessageTo(e,key,value));
    }
    /**
     * Produces a message to the specified Kafka topic with the given key and value.
     *
     * @param topic The Kafka topic to produce the message to.
     * @param key The key of the message.
     * @param value The value of the message.
     */
    public void produceMessageTo(String topic, String key, String value) {
        log.info("[MS][KAFKA] START Producing(Order={}) to topic({}) ",key,topic);
        producer.send(new ProducerRecord<>(topic, key,value));
        producer.flush();
        log.info("[MS][KAFKA] DONE Producing(Order={}) to topic({}) ",key,topic);
    }

}
