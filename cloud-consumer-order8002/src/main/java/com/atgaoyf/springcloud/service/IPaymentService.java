package com.atgaoyf.springcloud.service;

import com.atgaoyf.springcloud.entities.CommonResult;
import com.atgaoyf.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/15 10:51
 */
@FeignClient("payment-service")
@RequestMapping("/payment")
public interface IPaymentService {

    @GetMapping("/find/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") int id);
}
