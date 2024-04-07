package com.ticom.models.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ticom.models.order.action.TicomActions;
import com.ticom.models.order.customer.TicomCustomerInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicomOrder {

    @JsonProperty("entity")
    TicomEntity entity;
    @JsonProperty("customerInfo")
    TicomCustomerInfo customerInfo;
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
    @JsonProperty("nextTopic")
    List<String> nextTopic;
    @JsonProperty("orderDetails")
    TicomOrderDetails orderDetails;

    @JsonProperty("retryFailed")
    Integer retryFailed;
    @JsonProperty("retryPending")
    Integer retryPending;
    @JsonProperty("retryRecycle")
    Integer retryRecycle;

    @JsonProperty("actions")
    List<TicomActions> actions;

    @JsonIgnore
    public String toJson() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (Exception ignored) {
            return null;
        }
    }
    @JsonIgnore
    public static TicomOrder getOrderFromString(String value) throws JsonProcessingException {
        return new ObjectMapper().readValue(value, TicomOrder.class);
    }
}
