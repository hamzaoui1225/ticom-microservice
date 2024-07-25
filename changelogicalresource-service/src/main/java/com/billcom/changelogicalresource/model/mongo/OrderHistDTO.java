package com.billcom.changelogicalresource.model.mongo;


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
public class OrderHistDTO {
    @JsonProperty("executionDate")
    String executionDate;
    @JsonProperty("microservice")
    String microservice;
    @JsonProperty("command_id")
    String commandId;
    @JsonProperty("topic")
    String topic;
    @JsonProperty("description")
    String description;
    @JsonProperty("status")
    String status;

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
    public OrderHistDTO(String microservice, String topic, String commandId, String description, String status){
        executionDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now());
        this.topic = topic;
        this.microservice = microservice;
        this.description = description;
        this.status = status;
        this.commandId = commandId;
    }
}
