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
@JsonRootName("products")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductsDTO {
    @JsonProperty("productShoppingCardId")
    String productShoppingCardId;
    @JsonProperty("productCode")
    String productCode;
    @JsonProperty("productDescription")
    String productDescription;
    @JsonProperty("productProcessedStatus")
    String productProcessedStatus;
    @JsonProperty("quantity")
    Integer quantity;
   
    @JsonProperty("productDetail")
    ProductDetailDTO productDetail;

    @JsonProperty("retryFailed")
    Integer retryFailed;
    @JsonProperty("retryPending")
    Integer retryPending;
    @JsonProperty("retryRecycle")
    Integer retryRecycle;

}
