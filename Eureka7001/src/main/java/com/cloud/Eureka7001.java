package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/31
 * @Time 18:19
 */
@SpringBootApplication
@EnableEurekaServer // 表示是个注册中心
public class Eureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class, args);
    }
}


