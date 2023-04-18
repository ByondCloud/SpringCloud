package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/29
 * @Time 18:53
 */

@SpringBootApplication
@EnableEurekaClient
public class Pay8002 {
    public static void main(String[] args) {
        SpringApplication.run(Pay8002.class, args);
    }
}
