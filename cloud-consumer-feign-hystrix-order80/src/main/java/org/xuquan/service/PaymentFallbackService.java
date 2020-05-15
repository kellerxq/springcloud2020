package org.xuquan.service;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-15 02:54
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService paymentInfo_OK错误返回";
    }

    @Override
    public String paymentInof_TimeOut(Integer id) {
        return "PaymentFallbackService paymentInof_TimeOut错误返回";
    }
}
