package com.atgaoyf.springcloud.dao;

import com.atgaoyf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IPaymentMapper {
    public int insert(Payment payment);
    public Payment getPaymentById(int id);
    public int deleteById(int id);
}
