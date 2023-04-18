package com.cloud.service;

import com.cloud.service.impl.PaymentFallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/8
 * @Time 0:57
 */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackServiceImpl.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok")
    public String paymentInfo_OK();

    @GetMapping("/payment/hystrix/timeout")
    public String paymentInfo_TIMEOUT();

}
