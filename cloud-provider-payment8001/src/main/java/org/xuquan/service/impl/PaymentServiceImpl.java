package org.xuquan.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.xuquan.dao.PaymentDao;
import org.xuquan.entities.Payment;
import org.xuquan.service.PaymentService;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-13 05:13
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
