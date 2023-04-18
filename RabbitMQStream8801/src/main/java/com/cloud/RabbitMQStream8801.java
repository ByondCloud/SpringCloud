package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/14
 * @Time 11:40
 */
@SpringBootApplication
@EnableEurekaClient
public class RabbitMQStream8801 {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQStream8801.class, args);
    }
}
