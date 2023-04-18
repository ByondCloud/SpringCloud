package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/6
 * @Time 15:19
 */
@SpringBootApplication
@EnableDiscoveryClient // 作为注册中心使用的注解
public class Pay8004 {
    public static void main(String[] args) {
        SpringApplication.run(Pay8004.class, args);
    }
}
