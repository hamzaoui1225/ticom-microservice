package com.billcom.createcustomer.model.mongo.order;



import com.billcom.createcustomer.model.mongo.order.action.ActionsDTO;
import com.billcom.createcustomer.model.mongo.order.customer.CustomerInfoDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    @JsonProperty("entity")
    EntityDTO entity;
    @JsonProperty("customerInfo")
    CustomerInfoDTO customerInfo;
    @JsonProperty("commandId")
    String commandId;
    @JsonProperty("createdBy")
    String createdBy;
    @JsonProperty("creationDate")
    String creationDate;
    @JsonProperty("statusOrder")
    String statusOrder;

    @JsonProperty("topic")
    String topic;
    @JsonProperty("retryFailed")
    Integer retryFailed;
    @JsonProperty("retryPending")
    Integer retryPending;
    @JsonProperty("retryRecycle")
    Integer retryRecycle;
    @JsonProperty("actions")
    List<ActionsDTO> actions;

    @JsonIgnore
    Long dealerId;
    @JsonIgnore
    Integer prgCode;


    @JsonIgnore
    public String toJson() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            log.warn("[MS][WARN] ERROR IN CONVERTING ORDER TO STRING");
        }
        return null;
    }

}
