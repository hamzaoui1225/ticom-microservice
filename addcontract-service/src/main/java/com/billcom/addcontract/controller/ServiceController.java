package com.billcom.addcontract.controller;

import com.billcom.addcontract.bean.DataBaseClient;
import com.billcom.addcontract.model.mongo.Contract;
import com.billcom.addcontract.model.mongo.ContractRequest;
import com.billcom.addcontract.model.mongo.order.OrderDTO;
import com.billcom.addcontract.service.impl.CheckServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ServiceController {
    final DataBaseClient client;
    final CheckServiceImp service;

    @PostMapping("/createContract")
    Contract createContract(@RequestBody ContractRequest contract) {
        return client.createContract(contract);
    }
    @PostMapping("/runOrder")
    void runOrder(@RequestBody OrderDTO contract) {
        service.checkAddContract(contract.getCommandId(), contract.toJson());
    }
}
