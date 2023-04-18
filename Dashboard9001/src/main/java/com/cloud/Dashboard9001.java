package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/8
 * @Time 19:50
 */
@SpringBootApplication
@EnableHystrixDashboard // 开启Dashboard
public class Dashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard9001.class, args);
    }
}
