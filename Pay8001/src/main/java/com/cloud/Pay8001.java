package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/29
 * @Time 18:53
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Pay8001 {
    public static void main(String[] args) {
        SpringApplication.run(Pay8001.class, args);
    }
}
