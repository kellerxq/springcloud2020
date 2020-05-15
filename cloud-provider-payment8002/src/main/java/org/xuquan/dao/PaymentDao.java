package org.xuquan.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.xuquan.entities.Payment;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-13 04:59
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
