package com.billcom.changelogicalresource.service;


import com.billcom.changelogicalresource.bean.Extern;
import com.billcom.changelogicalresource.configuration.KafkaConfig;
import com.billcom.changelogicalresource.service.impl.CheckServiceImp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ThreadService {
    final KafkaConfig kafkaconfig;
    final CheckServiceImp service;

    List<KafkaStreams> streams = new ArrayList<>();



    public int startNewThread() {
        log.debug("****Start Creat New Thread ****");
        StreamsBuilder streamsbuilder = new StreamsBuilder();
        streamsbuilder.stream( Extern.getTopicThis(), Consumed.with(Serdes.String(), Serdes.String()))
                .foreach( service::exceptionHandler );
        KafkaStreams stream = new KafkaStreams(streamsbuilder.build(), kafkaconfig.kafkaStreamConfig());
        stream.start();
        streams.add(stream);
        Runtime.getRuntime().addShutdownHook(new Thread(stream::close));
        log.debug("****Shut Down Thread ****");
        return streams.size();
    }

    public void killAllThreads() {
        log.debug("[MS][DEBUG] **** Start Method kill All Threads ****");
        streams.forEach(e -> {e.close();e.cleanUp();});
        streams.clear();
    }

    public String killThreadById(@Range(min=0) int id){
        log.debug("[MS][DEBUG] **** Start Method kill Thread By Id ****");
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
