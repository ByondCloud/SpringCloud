package com.cloud.controller;

import com.cloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/8
 * @Time 1:00
 */
@RequestMapping("/consumer")
@RestController
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/payment/hystrix/ok")
    public String paymentInfo_OK() {
        return paymentHystrixService.paymentInfo_OK();
    }


    @GetMapping("/payment/hystrix/timeout")
//    @HystrixCommand(fallbackMethod = "paymentTimeoutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
//    @HystrixCommand
    public String paymentInfo_TIMEOUT() {
        return paymentHystrixService.paymentInfo_TIMEOUT();
    }

    public String paymentTimeoutFallbackMethod() {
        return "客户端的fallback方法";
    }

    // 全局fallback
    public String payment_Global_FallbackMethod() {
        return "全局fallback方法";
    }
}
