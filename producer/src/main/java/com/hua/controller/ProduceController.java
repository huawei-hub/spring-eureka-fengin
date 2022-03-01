package com.hua.controller;

import com.hua.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

    @Value("${server.port}")
    private String servicePort;
    @Autowired
    private ProduceService produceService;

    @GetMapping("/getUser")
    public String getUser() {
        String user = produceService.getUser();
        return user + servicePort;
    }
}