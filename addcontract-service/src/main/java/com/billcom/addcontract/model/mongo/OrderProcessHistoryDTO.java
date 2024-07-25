package com.billcom.addcontract.model.mongo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProcessHistoryDTO{
    @JsonProperty("executionDate")
    String executionDate;
    @JsonProperty("microservice")
    String microservice;
    @JsonProperty("commandId")
    String commandId;
    @JsonProperty("topic")
    String topic;
    @JsonProperty("description")
    String description;
    @JsonProperty("status")
    String status;
    @JsonProperty("actionCode")
    String actionCode;
    @Override
    public String toString() {
        ObjectMapper m = new ObjectMapper();
        try {
            return m.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

    @JsonIgnore
    public OrderProcessHistoryDTO(String microservice, String topic, String commandId, String description, String status,String actionCode){
        this.executionDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now());
        this.topic = topic;
        this.microservice = microservice;
        this.description = description;
        this.status = status;
        this.actionCode = actionCode;
        this.commandId = commandId;
    }
}
