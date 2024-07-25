package com.billcom.changelogicalresource.controller;

import com.billcom.changelogicalresource.bean.client.DataBaseClient;
import com.billcom.changelogicalresource.model.mongo.order.OrderDTO;
import com.billcom.changelogicalresource.service.impl.CheckServiceImp;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
@RequiredArgsConstructor
public class ServicesController {

    final CheckServiceImp serviceImp;
    final DataBaseClient db;
    @PostMapping("/RunOrder")
    public void injectOrder(@RequestBody String order) throws JsonProcessingException {
        OrderDTO c = serviceImp.getOrderDTO( order );
        serviceImp.exceptionHandler(c.getCommandId(),order);
    }
    @GetMapping("/ChangeResourceDN")
    public void changeResourceDN(@RequestParam Integer coId, @RequestParam Integer number) {
        db.changeContractResource(coId, number);
    }

}
