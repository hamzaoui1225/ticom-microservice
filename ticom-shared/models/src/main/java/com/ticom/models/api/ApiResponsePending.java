package com.ticom.models.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@JsonDeserialize
@EqualsAndHashCode(callSuper = true)
public class ApiResponsePending extends ApiResponse {

    public Boolean isPended;

    public ApiResponsePending(String message, String messageCode, Boolean isSuccessful, Boolean isPended) {
        super(messageCode, message, isSuccessful);
        this.isPended = isPended;
    }

}
