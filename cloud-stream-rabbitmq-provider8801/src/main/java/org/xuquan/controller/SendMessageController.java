package org.xuquan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xuquan.service.IMessageProvider;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-16 04:29
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
