package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/14
 * @Time 12:11
 */
@SpringBootApplication
@EnableEurekaClient
public class RabbitMQStreamConsumer8802 {
    public static void main(String[] args) {

        SpringApplication.run(RabbitMQStreamConsumer8802.class, args);
    }
}
