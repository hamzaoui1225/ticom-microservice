package com.billcom.changecontractstatus.bean;

import com.billcom.changecontractstatus.exception.CannotFetchTopicNamesException;
import com.billcom.changecontractstatus.model.mongo.TopicDocument;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;


@Slf4j
@Component("fetchingFromMongo")
@RequiredArgsConstructor
public class FetchingTopicBean{

    final ApplicationContext ct;

    public void exit(Integer code)
    {
         log.error("[MS][INFO] EXITING with code:{}",code);
         SpringApplication.exit(ct,() -> code);
         throw new CannotFetchTopicNamesException("Closing MS with Code= " +code);
    }

    private TopicDocument fetchFromMongodb(){
        try (MongoClient db = MongoClients.create(Extern.getMongoUrl()))
        {
            MongoDatabase gps = db.getDatabase(Extern.getMongoDataBaseName());
            MongoCollection<Document> orders = gps.getCollection(Extern.getMongoDocumentGetTopic());
            FindIterable<Document> f = orders.find(Filters.eq("microservice",Extern.getMicroServiceName().toLowerCase()));
            try (MongoCursor<Document> c = f.cursor()){
                if (c.hasNext()){
                    Document current = c.next();
                    return new TopicDocument(
                            Extern.getMicroServiceName().toLowerCase(),
                            (ArrayList<String>) current.getList("producerTopic", String.class),
                            current.getString("consumerTopic")
                    );
                }
                return null;
            }
        }
    }

    private Optional<TopicDocument> getTopicDocument(){
        return Optional.ofNullable(fetchFromMongodb());
    }

    @Bean
    @DependsOn({"externConfig"})
    public void fetchingTopicData(){
          try{
                log.info("[MS][INFO] START fetching topic from mongo...");
                TopicDocument res = getTopicDocument()
                        .or(() -> {
                            try (MongoClient db = MongoClients.create(Extern.getMongoUrl()))
                            {
                                db.getDatabase(Extern.getMongoDataBaseName())
                                        .getCollection(Extern.getMongoDocumentGetTopic())
                                        .insertOne(Document.parse(
                                                new ObjectMapper().writeValueAsString(
                                                        new TopicDocument(
                                                                Extern.getMicroServiceName().toLowerCase(), null,null
                                                        )
                                                )
                                        ));
                            } catch (JsonProcessingException e) {
                                log.error("[MS][ERROR] JsonProcessing Exception.\n" + e.getMessage());
                                exit(500);
                            }
                            return Optional.of(new TopicDocument());
                        }).orElseThrow(() -> new CannotFetchTopicNamesException("Closing MS with Code= " + 404));

                if ((res.getProducerTopic() == null) || (res.getProducerTopic().isEmpty()) || (res.getConsumerTopic() == null))
                    exit(404);

                Extern.setTopicThis(res.getConsumerTopic());
                Extern.setTopicNext(res.getProducerTopic());

              log.info("[MS][INFO] DONE fetching topic from mongo.");
              log.info("[MS][INFO] {} Subscribe To [{}] Publish To {}",Extern.getMicroServiceName(),Extern.getTopicThis(),Extern.getTopicNext());

          } catch (MongoException e){
              log.error("[MS][ERROR] Mongo Exception.\n" + e.getMessage());
              exit(500);
          }
    }



}
