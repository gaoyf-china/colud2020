package com.atgaoyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication {
    
    /*
     * @Author gaoyf
     * @Description 主启动类
     * @Date  
     * @Param 
     * @return 
     **/
    public static void main(String[] args) {

        SpringApplication.run(PaymentApplication.class, args);
    }
}
