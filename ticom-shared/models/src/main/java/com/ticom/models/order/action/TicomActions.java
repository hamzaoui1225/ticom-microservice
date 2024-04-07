package com.ticom.models.order.action;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ticom.models.order.product.TicomProducts;
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
@JsonRootName("actions")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicomActions {
    @JsonProperty("actionCode")
    String actionCode;
    @JsonProperty("actionDescription")
    String actionDescription;
    @JsonProperty("actionProcessedStatus")
    String actionProcessedStatus;
    @JsonProperty("userAction")
    String userAction;
    @JsonProperty("moveContract")
    Boolean moveContract;
    @JsonProperty("actionDate")
    String actionDate;
    @JsonProperty("useJackpot")
    Boolean useJackpot;
    @JsonProperty("contractSpec")
    TicomContractSpec contractSpec;
    @JsonProperty("resourceSpec")
    TicomResourceSpec resourceSpec;
    @JsonProperty("retryFailed")
    Integer retryFailed;
    @JsonProperty("retryPending")
    Integer retryPending;
    @JsonProperty("retryRecycle")
    Integer retryRecycle;
    @JsonProperty("products")
    List<TicomProducts> products;
}