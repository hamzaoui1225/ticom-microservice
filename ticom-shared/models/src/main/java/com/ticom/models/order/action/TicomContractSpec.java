package com.ticom.models.order.action;

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
@JsonRootName("contractSpec")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicomContractSpec {
    @JsonProperty("market")
    String market;
    @JsonProperty("subMarket")
    String subMarket;
    @JsonProperty("coCode")
    String coCode;
    @JsonProperty("coId")
    Long coId;
    @JsonProperty("coStatus")
    String coStatus;
    @JsonProperty("poPlanDescription")
    String poPlanDescription;
    @JsonProperty("poPlanCode")
    String poPlanCode;
}
