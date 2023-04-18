package com.cloud.service;

import com.cloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/29
 * @Time 18:41
 */
public interface PaymentService {


    // 新增
    public int create(Payment payment);

    // 通过id查询
    public Payment getPaymentById(@Param("id") Long id);

}
