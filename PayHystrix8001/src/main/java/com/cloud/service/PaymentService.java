package com.cloud.service;


/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/7
 * @Time 23:52
 */
public interface PaymentService {

    public String paymentInfo_OK();

    public String paymentInfo_Timeout();

    public String paymentCircuitBreak(Integer id);

}
