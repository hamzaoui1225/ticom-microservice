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
@JsonRootName("billingAccount")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicomBillingAccount {

    @JsonProperty("billingCycle")
    String billingCycle;
    @JsonProperty("billingPeriod")
    String billingPeriod;
    @JsonProperty("billingAccountDate")
    String billingAccountDate;
    @JsonProperty("iban")
    String iban;
    @JsonProperty("invoiceFormat")
    String invoiceFormat;
    @JsonProperty("pricePlan")
    String pricePlan;
    @JsonProperty("paymentModeInfo")
    TicomPaymentModeInfo paymentModeInfo;
    @JsonProperty("addressInfo")
    TicomAddressInfo addressInfo;

}
