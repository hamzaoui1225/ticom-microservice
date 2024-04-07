package com.ticom.models.order.customer;

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
@JsonRootName("paymentModeInfo")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicomPaymentModeInfo {
    @JsonProperty("accountHolder")
    String accountHolder;
    @JsonProperty("accountNumber")
    String accountNumber;
    @JsonProperty("agencyAdress")
    String agencyAddress;
    @JsonProperty("agencyCode")
    String agencyCode;
    @JsonProperty("bankCode")
    String bankCode;
    @JsonProperty("paymentMode")
    String paymentMode;
    @JsonProperty("ribKey")
    String ribKey;
    @JsonProperty("coordinates")
    TicomCoordinates coordinates;
}
