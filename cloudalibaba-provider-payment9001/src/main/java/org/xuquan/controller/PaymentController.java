package org.xuquan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-16 15:53
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return "Hello Nacos Discovery id:" + id + "\tserverPort:" + serverPort;
    }
}
