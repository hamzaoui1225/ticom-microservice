package com.billcom.changecontractstatus.model.mongo.order.customer;

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
@JsonRootName("contactParam")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactParamDTO {

    @JsonProperty("customerType")
    String customerType;
    @JsonProperty("citizenshipCode")
    String citizenshipCode;
    @JsonProperty("citizenshipType")
    String citizenshipType;
    @JsonProperty("firstName")
    String firstName;
    @JsonProperty("lastName")
    String lastName;
    @JsonProperty("birthDate")
    String birthDate;
    @JsonProperty("civility")
    String civility;
    @JsonProperty("nationality")
    String nationality;
    @JsonProperty("email")
    String email;
    @JsonProperty("email2")
    String email2;
    @JsonProperty("industry")
    String industry;
    @JsonProperty("phoneNumber")
    String phoneNumber;
    @JsonProperty("phoneNumberAttr")
    String phoneNumberAttr;
    @JsonProperty("mobileNumber")
    String mobileNumber;
    @JsonProperty("auxiliaryNumber")
    String auxiliaryNumber;
    @JsonProperty("issueDate")
    String issueDate;
    @JsonProperty("issuePlace")
    String issuePlace;
    @JsonProperty("jobTitle")
    Integer jobTitle;
    @JsonProperty("martialStatus")
    String martialStatus;
    @JsonProperty("addressInfo")
    AddressInfoDTO addressInfo;
}
