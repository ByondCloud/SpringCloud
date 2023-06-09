package com.cloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/6
 * @Time 18:05
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "SpringCloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
