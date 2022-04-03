package com.atgaoyf.springcloud;

import com.atgaoyf.ribbon.config.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name = "payment-service", configuration = MyRule.class)
public class ConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication.class, args);
    }
}
