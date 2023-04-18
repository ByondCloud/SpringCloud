package com.cloud.controller;

import com.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/7
 * @Time 23:57
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;



    @GetMapping("/payment/hystrix/ok")
    public String paymentInfo_OK() {
        return paymentService.paymentInfo_OK();
    }

    @GetMapping("/payment/hystrix/timeout")
    public String paymentInfo_TIMEOUT() {
        return paymentService.paymentInfo_Timeout();
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String s = paymentService.paymentCircuitBreak(id);
        return s;
    }
}
