package com.billcom.changephysicalresource.controller;

import com.billcom.changephysicalresource.model.mongo.order.OrderDTO;
import com.billcom.changephysicalresource.service.impl.CheckServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/Services")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ServicesController {


    final CheckServiceImp service;

    @PostMapping("/RunOrder")
    public void injectOrder(@RequestBody OrderDTO order){
         service.exceptionHandler("Swagger Test",order.toJson());
    }


}
