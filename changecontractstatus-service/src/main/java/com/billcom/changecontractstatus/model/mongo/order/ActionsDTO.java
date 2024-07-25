package com.billcom.changecontractstatus.model.mongo.order;

import com.billcom.changecontractstatus.model.mongo.order.product.ContractSpecDTO;
import com.billcom.changecontractstatus.model.mongo.order.product.ProductsDTO;
import com.billcom.changecontractstatus.model.mongo.order.product.ResourceSpecDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
public class ActionsDTO {

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
    ContractSpecDTO contractSpec;
    @JsonProperty("resourceSpec")
    ResourceSpecDTO resourceSpec;

    @JsonProperty("products")
    List<ProductsDTO> products;

}
