package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/6
 * @Time 18:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Pay8006 {

    public static void main(String[] args) {
        SpringApplication.run(Pay8006.class);
    }


}
