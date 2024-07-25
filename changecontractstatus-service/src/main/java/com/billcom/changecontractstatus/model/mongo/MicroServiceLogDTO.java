package com.billcom.changecontractstatus.model.mongo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class MicroServiceLogDTO {
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

    public String toJson() {
        ObjectMapper m = new ObjectMapper();
        try {
            return m.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

    @JsonIgnore
    public MicroServiceLogDTO(String microservice, String topic, String commandId, String description, String status,String actionCode){
        this.executionDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now());
        this.topic = topic;
        this.microservice = microservice;
        this.description = description;
        this.status = status;
        this.commandId = commandId;
        this.actionCode = actionCode;
    }

}
