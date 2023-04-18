package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/6
 * @Time 20:50
 */
@Configuration
public class MySelfRule {

    // 将随机策略注入进Spring
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }

}
