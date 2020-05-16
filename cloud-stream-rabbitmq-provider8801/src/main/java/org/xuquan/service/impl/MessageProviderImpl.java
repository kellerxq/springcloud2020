package org.xuquan.service.impl;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.xuquan.service.IMessageProvider;

import javax.annotation.Resource;
import java.util.UUID;


/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-16 04:20
 */
@EnableBinding(Source.class) //定义消息的摄像头管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial:" + serial);
        return null;
    }
}
