package com.cloud.service;

import com.cloud.entity.CommonResult;
import com.cloud.entity.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/7
 * @Time 17:00
 */
@FeignClient("CLOUD-PAYMENT-SERVICE") // 告诉目标地址
public interface PaymentFeignService {

    @GetMapping("/payment/getPaymentById/{id}") // 都复制需要调用的模块的Controller
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();

}
