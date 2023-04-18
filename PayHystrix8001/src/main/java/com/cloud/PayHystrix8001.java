package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/7
 * @Time 23:47
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix // 添加该注解，启动服务熔断
public class PayHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayHystrix8001.class, args);
    }
}
