package com.cloud.service.impl;

import com.cloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/7
 * @Time 23:53
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_OK() {
        return "成功的方法";
    }

    // fallback，如果报错或者超时，走这个方法
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            // 3秒以内走正常的业务，超过走fallback
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "7000")
    })
    @Override
    public String paymentInfo_Timeout() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时3秒的方法";
    }

    public String paymentInfo_TimeOutHandler() {
        // fallback调用方法

        return "fallback调用方法";
    }


    // ---------------服务熔断------------------



    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback"
            , commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启熔断器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") // 失败率达到60%跳闸

    }
    )
    @Override
    public String paymentCircuitBreak(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能为负数");
        }
        return UUID.randomUUID().toString();
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id) {
        return "id不能为负数";
    }




}
