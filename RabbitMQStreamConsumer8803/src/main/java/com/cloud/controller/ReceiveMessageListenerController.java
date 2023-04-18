package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/14
 * @Time 12:12
 */
@RestController
@EnableBinding(Sink.class) // 接收端
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者收到的消息: " + message.getPayload() + "\t 端口为: " + serverPort);
    }

}
