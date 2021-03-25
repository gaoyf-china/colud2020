package com.atgaoyf.cloud.controller;

import com.atgaoyf.springcloud.entities.CommonResult;
import com.atgaoyf.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021.3.25 9:12
 */
@RestController
@RequestMapping("/sleuth")
public class SleuthController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/find/{id}")
    public CommonResult findPayment(@PathVariable String id) {

        CommonResult<Payment> payment = restTemplate.getForObject("http://payment-service/payment/find/{ee}", CommonResult.class, id);

        return payment;
    }
}
