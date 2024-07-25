package com.billcom.createcustomer.model.mongo.order.product;

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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize
@JsonDeserialize
@JsonRootName("productSpec")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductSpecDTO {
    @JsonProperty("productType")
    Integer productType;
    @JsonProperty("catalogId")
    Long catalogId;
    @JsonProperty("productId")
    Long productId;
    @JsonProperty("productClass")
    String productClass;
    @JsonProperty("productSubClass")
    String productSubClass;
    @JsonProperty("itemType")
    String itemType;
    @JsonProperty("itemSubtypeId")
    String itemSubtypeId;
    @JsonProperty("externalId")
    String externalId;
    @JsonProperty("productCategory")
    String productCategory;
    @JsonProperty("taxCode")
    Integer taxCode;
    @JsonProperty("poId")
    String poId;
    @JsonProperty("poType")
    String poType;
}
