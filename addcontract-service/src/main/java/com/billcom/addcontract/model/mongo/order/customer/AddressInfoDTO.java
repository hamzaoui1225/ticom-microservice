package com.billcom.addcontract.model.mongo.order.customer;

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
@JsonRootName("addressInfo")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressInfoDTO {

    @JsonProperty("building")
    String building;
    @JsonProperty("streetName")
    String streetName;
    @JsonProperty("streetNumber")
    String streetNumber;
    @JsonProperty("streetType")
    String streetType;
    @JsonProperty("streetTypeExtension")
    String streetTypeExtension;
    @JsonProperty("addressExtension")
    String addressExtension;
    @JsonProperty("delegation")
    String delegation;
    @JsonProperty("country")
    String country;
    @JsonProperty("governorate")
    String governorate;
    @JsonProperty("locality")
    String locality;
    @JsonProperty("postalCode")
    String postalCode;
    @JsonProperty("coordinates")
    CoordinatesDTO coordinates;

}
