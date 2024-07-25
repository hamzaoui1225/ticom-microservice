package com.billcom.changecontractstatus.controller;


import com.billcom.changecontractstatus.model.mongo.order.OrderDTO;
import com.billcom.changecontractstatus.service.impl.CheckServiceImp;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ServicesController {

    final CheckServiceImp service;

    @PostMapping("/RunOrder")
    public void injectOrder(@RequestBody OrderDTO order) throws JsonProcessingException {
        service.exceptionHandler("Swagger Test",service.getStringFromObject(order));
    }

}
