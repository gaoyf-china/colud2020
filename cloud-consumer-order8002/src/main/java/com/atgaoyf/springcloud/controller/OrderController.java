package com.atgaoyf.springcloud.controller;

import com.atgaoyf.springcloud.entities.CommonResult;
import com.atgaoyf.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/5 19:06
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult<Integer> add(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, CommonResult.class);
    }

    @GetMapping("/find/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") int id) {

        return restTemplate.getForObject(PAYMENT_URL + "/payment/find/{id}", CommonResult.class, id);
    }

    @DeleteMapping("/remove/{id}")
    public CommonResult<Integer> removePayment(@PathVariable("id") int id) {

        return restTemplate.getForObject(PAYMENT_URL + "/payment/remove/{id}", CommonResult.class, id);
    }
}
