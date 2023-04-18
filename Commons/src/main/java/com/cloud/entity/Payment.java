package com.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/29
 * @Time 18:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable { // 分布式有可能用的到串行化
    private Long id; // id
    private String serial; // 支付流水号
}
