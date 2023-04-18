package com.cloud;

import org.aspectj.weaver.ast.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/6
 * @Time 17:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Orderzk80 {
    public static void main(String[] args) {
        SpringApplication.run(Orderzk80.class, args);
    }
}
