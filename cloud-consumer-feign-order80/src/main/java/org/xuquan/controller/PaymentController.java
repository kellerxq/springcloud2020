package org.xuquan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.xuquan.entities.CommonResult;
import org.xuquan.entities.Payment;
import org.xuquan.service.PaymentFeignService;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-14 22:03
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/feign/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        return paymentFeignService.paymentFeignTimeout();
    }
}
