package org.xuquan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-16 04:43
 */
@RestController
@EnableBinding(Sink.class)
public class ReceiceMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者2，------>接受到的消息：" + message.getPayload() + "\t" + serverPort);
    }
}