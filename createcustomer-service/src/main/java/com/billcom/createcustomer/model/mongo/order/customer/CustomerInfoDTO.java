package com.billcom.createcustomer.model.mongo.order.customer;

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
@JsonRootName("customerInfo")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerInfoDTO {

    @JsonProperty("contactId")
    String contactId;
    @JsonProperty("custNum")
    String custNum;
    @JsonProperty("custCode")
    String custCode;
    @JsonProperty("costCenter")
    Integer costCenter;
    @JsonProperty("custCatCode")
    Integer custCatCode;
    @JsonProperty("actualBalance")
    String actualBalance;
    @JsonProperty("clientGroup")
    String clientGroup;
    @JsonProperty("clientStatus")
    String clientStatus;
    @JsonProperty("startValidationDate")
    String startValidationDate;
    @JsonProperty("taxCategory")
    String taxCategory;
    @JsonProperty("billingAccount")
    BillingAccountDTO billingAccount;
    @JsonProperty("contactParam")
    ContactParamDTO contactParam;

    @JsonProperty("companyName")
    String companyName;
}
