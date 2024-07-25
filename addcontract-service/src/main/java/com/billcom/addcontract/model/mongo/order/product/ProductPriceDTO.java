package com.billcom.addcontract.model.mongo.order.product;

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
@JsonRootName("productPrice")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductPriceDTO {

    @JsonProperty("originalAmount")
    String originalAmount;
    @JsonProperty("recurringOriginAmount")
    Integer recurringOriginAmount;
    @JsonProperty("discountType")
    String discountType;
    @JsonProperty("discountValue")
    String discountValue;
    @JsonProperty("priceExclTax")
    String priceExclTax;
    @JsonProperty("priceInclTax")
    String priceInclTax;
    @JsonProperty("recurringExclTax")
    Integer recurringExclTax;

}
