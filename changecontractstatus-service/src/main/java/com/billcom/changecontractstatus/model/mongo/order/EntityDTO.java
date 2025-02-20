package com.billcom.changecontractstatus.model.mongo.order;

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
@JsonRootName("entity")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityDTO {
    @JsonProperty("canal")
    String canal;
    @JsonProperty("userName")
    String userName;
    @JsonProperty("entityId")
    String entityId;
    @JsonProperty("entityName")
    String entityName;
    @JsonProperty("entityTypeId")
    String entityTypeId;
    @JsonProperty("entityTypeShdes")
    String entityTypeShdes;
    @JsonProperty("entityTypeDescription")
    String entityTypeDescription;
    @JsonProperty("externalUserContact")
    String externalUserContact;
    @JsonProperty("externalUserName")
    String externalUserName;
}
