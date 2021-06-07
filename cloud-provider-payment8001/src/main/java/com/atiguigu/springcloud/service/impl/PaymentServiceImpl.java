package com.atiguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atiguigu.springcloud.dao.PaymentDao;
import com.atiguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @title: PaymentServiceImpl
 * @Author jinhw
 * @Date: 2021/6/6 21:17
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
