package com.atgaoyf.springcloud.service.impl;

import com.atgaoyf.springcloud.dao.IPaymentMapper;
import com.atgaoyf.springcloud.entities.Payment;
import com.atgaoyf.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/3 16:11
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private IPaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(int id) {
        return paymentMapper.getPaymentById(id);
    }

    @Override
    public int deleteById(int id) {
        return paymentMapper.deleteById(id);
    }
}
