package com.cloud.service.impl;

import com.cloud.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/8
 * @Time 3:05
 */
@Service
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK() {
        return "---------PaymentFallbackServiceImpl, ok";
    }

    @Override
    public String paymentInfo_TIMEOUT() {
        return "---------PaymentFallbackServiceImpl, timeout";
    }
}
