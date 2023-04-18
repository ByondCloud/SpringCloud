package com.cloud;

import cn.hutool.db.sql.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/7
 * @Time 16:17
 */
@SpringBootApplication
@EnableFeignClients // 开启feign
public class OrderOpenFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeign80.class, args);
    }
}
