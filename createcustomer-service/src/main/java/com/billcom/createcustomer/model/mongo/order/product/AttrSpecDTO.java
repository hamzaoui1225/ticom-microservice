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
@JsonRootName("attrSpec")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttrSpecDTO {
    @JsonProperty("attributeValue")
    String attributeValue;
    @JsonProperty("attributeDes")
    String attributeDes;
    @JsonProperty("attributeCode")
    String attributeCode;
    @JsonProperty("attributeExtId")
    String attributeExtId;
    @JsonProperty("attributeValueDes")
    String attributeValueDes;
}
