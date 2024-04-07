package com.ticom.models.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicomFailedDetails {
    @JsonProperty("failedDate")
    String failedDate;
    @JsonProperty("failedLevel")
    Integer failedLevel;
    @JsonProperty("failedDescription")
    String failedDescription;
    @JsonProperty("failedActionIndex")
    Integer failedActionIndex;
    @JsonProperty("failedProductIndex")
    Integer failedProductIndex;
}
