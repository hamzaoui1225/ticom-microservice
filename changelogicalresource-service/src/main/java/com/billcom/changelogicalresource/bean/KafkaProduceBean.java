package com.billcom.changelogicalresource.bean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class KafkaProduceBean {

    /**
     * Configures the properties for the Kafka producer.
     * properties to be set for the Kafka producer.
     *                    Example properties:
     *                    - bootstrap.servers: A list of host/port pairs to use for establishing the initial connection to the Kafka cluster.
     *                    - key.serializer: The class name of the serializer for key objects.
     *                    - value.serializer: The class name of the serializer for value objects.
     *                    - RETRIES_CONFIG: The number of times the producer will retry sending a record in case of transient errors.
     *                    - ACKS_CONFIG :The number of acknowledgments the producer requires the leader to have received before considering a request complete.
     *                                   Possible values are "all", "none", and "1"
     *                    - batch.Size : The number of bytes to use for the batch size for each partition.
     *                    - linger.ms : The number of milliseconds that the producer will wait before sending a batch if the batch size is not reached
     *
     * @return  A new instance of KafkaProducerConfig with the specified configuration properties.
     *
     */
    @Bean
    @DependsOn({"fetchingFromMongo","externConfig"})
    Producer<String,String> producerRecord(){
        Properties config = new Properties();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Extern.getKafkaServer());
        config.put(ProducerConfig.ACKS_CONFIG, "all");
        config.put(ProducerConfig.RETRIES_CONFIG, 0);
        config.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        config.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        config.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new KafkaProducer<>(config);
    }
}
