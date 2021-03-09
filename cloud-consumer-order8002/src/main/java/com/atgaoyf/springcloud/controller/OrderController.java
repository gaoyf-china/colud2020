package com.atgaoyf.springcloud.controller;

import com.atgaoyf.springcloud.entities.CommonResult;
import com.atgaoyf.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/5 19:06
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-payment";

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/discovery")
    public DiscoveryClient showDiscovery() {

        List<String> services = discoveryClient.getServices();
        for(String str : services) {

            log.info(str);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment");
        for (ServiceInstance instance : instances) {

            log.info(instance.getServiceId() + "\t" + instance.getUri());
        }

        return discoveryClient;
    }
}
