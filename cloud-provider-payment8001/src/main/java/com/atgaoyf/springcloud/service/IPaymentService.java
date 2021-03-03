package com.atgaoyf.springcloud.service;

import com.atgaoyf.springcloud.entities.Payment;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/3 16:11
 */
public interface IPaymentService {
    public int insert(Payment payment);
    public Payment getPaymentById(int id);
    public int deleteById(int id);
}
