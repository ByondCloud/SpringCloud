package com.cloud.service.impl;

import com.cloud.service.MessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/14
 * @Time 11:42
 */
@EnableBinding(Source.class) // 定义消息的推送管道
public class MessageProviderImpl implements MessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("发送消息: " + serial);
        return null;
    }
}
