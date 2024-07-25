package com.billcom.createcustomer.service;


import com.billcom.createcustomer.bean.Extern;
import com.billcom.createcustomer.configuration.KafkaConfig;
import com.billcom.createcustomer.service.impl.CreateCustomerServiceImp;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ThreadService {
    final KafkaConfig kafka;
    final CreateCustomerServiceImp service;

    List<KafkaStreams> streams = new ArrayList<>();

    public int startNewThread() {
        StreamsBuilder streamsbuilder = new StreamsBuilder();
        streamsbuilder.stream(Extern.getTopicThis(), Consumed.with(Serdes.String(), Serdes.String()))
                .foreach(service::checkCreateCustomer);
        KafkaStreams stream = new KafkaStreams(streamsbuilder.build(), kafka.kafkaStreamConfig());
        stream.start();
        streams.add(stream);
        Runtime.getRuntime().addShutdownHook(new Thread(stream::close));
        return streams.size();
    }

    public void killAllThreads() {
        streams.forEach(e -> {e.close();e.cleanUp();});
        streams.clear();
    }

    public String killThreadById(@Range(min=0) int id){
        if (id < streams.size()) {
            streams.get(id).close();
            KafkaStreams remove = streams.remove(id);
            remove.close();
            return "Thread " + id + " Stopped Successfully.";
        }
        return "id("+ id +") Not Found.\nlist contains (" + streams.size() + ") thread.";
    }

    public int getThreadsNumber(){
        return streams.size();
    }

    public Object getThreadInfo(@Range(min=0) int id){
        return (id < streams.size()) ? streams.get(id).localThreadsMetadata() : null;
    }

    public Object getStreamInfo(@Range(min=0) int id){
        return (id < streams.size()) ? streams.get(id).allMetadata() : null;
    }


}
