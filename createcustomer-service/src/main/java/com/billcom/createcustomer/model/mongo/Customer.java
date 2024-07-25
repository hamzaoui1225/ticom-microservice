package com.billcom.createcustomer.model.mongo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
//    Integer customerId; //
//    String customerNumber; //
    String customerStatus;
    String citizenshipCode;
    String citizenshipType;
    String firstName;
    String lastName;
    String email;
    String sex;
    String country;
    String state;
    String city;
    Integer zipCode;
    String birthdate;
    String fcVode;
    String fcDes;
    String paymentMode;
    String customerPassword;
//    String customerActivated; //
    String priceGroupName;
//    Integer currency; //
}
