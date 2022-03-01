package com.hua.controller;

import com.hua.service.api.ProductApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProductApiService productApiService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getUser")
    public String getUser() {
        String user = productApiService.getUser();
        return "调用者：" + serverPort + " >> " + user;
    }
}
