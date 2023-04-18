package com.cloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/10
 * @Time 5:31
 */
@Component
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

    /**
     *
     * @param exchange 这个指的就是Request，Response
     * @param chain 这个是拦截器
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("全局过滤器");
        System.out.println(new Date());
        // 这里你要什么就拿什么
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname == null) {
            System.out.println("非法用户");

            // 这里就是编写response
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange); // 传递给下一个
    }

    @Override
    public int getOrder() { // 加载过滤器的顺序，return数字越小优先级越高
        return 0;
    }
}
