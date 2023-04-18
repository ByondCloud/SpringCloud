package com.cloud.controller;

import com.cloud.entity.CommonResult;
import com.cloud.entity.Payment;
import com.cloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/3/29
 * @Time 18:43
 */
@RequestMapping("/payment")
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    // 端口号
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果:" + result);

        if (result > 0) {
            return new CommonResult<Integer>(200, "插入成功, serverPort:" + serverPort, result);
        } else {
            return new CommonResult(404, "插入失败");
        }
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果:" + paymentById);
        if (paymentById != null) {
            return new CommonResult<>(200, "查询成功, serverPort:" + serverPort, paymentById);
        } else {
            return new CommonResult(404, "查询失败");
        }
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("****element:" + service);
        }
        log.info("***********************************");
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }

        return this.discoveryClient;
    }


    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return serverPort;
    }

    @GetMapping("/gatewayTest")
    public String gatewayTest() {
        return "gateway的测试" + serverPort;
    }

    @GetMapping("/zipkin")
    public String paymentZipkin() {
        return "zipkin";
    }

}
