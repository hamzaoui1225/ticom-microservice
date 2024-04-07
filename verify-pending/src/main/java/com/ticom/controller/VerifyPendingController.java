package com.ticom.controller;

import com.soap.client.alu.CoIdRequest;
import com.ticom.config.SoapHeaderConfig;
import com.ticom.models.api.ApiResponsePending;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pending")
public class VerifyPendingController {

    final SoapHeaderConfig soap;

    @GetMapping("/check")
    ApiResponsePending checkPending(@RequestParam Long coId) throws MalformedURLException, ServiceException, SOAPException, RemoteException {
        var response = soap.consumeAPCHandling().hasPendingRequest(new CoIdRequest(coId));
        return new ApiResponsePending(
                response.getComment(),
                response.getBscsErrorCode(),
                response.getIsSuccessful(),
                response.isPended()
        );
    }

}
