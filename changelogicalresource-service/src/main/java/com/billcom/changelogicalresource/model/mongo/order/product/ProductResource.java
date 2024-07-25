package com.billcom.changelogicalresource.model.mongo.order.product;

import com.billcom.changelogicalresource.model.mongo.order.action.LogicalResourceDTO;
import com.billcom.changelogicalresource.model.mongo.order.action.PhysicalResourceDTO;
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
@JsonRootName("productResource")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResource {
    @JsonProperty("logicalResource")
    LogicalResourceDTO logicalResource;
    @JsonProperty("physicalResource")
    PhysicalResourceDTO physicalResource;
}
