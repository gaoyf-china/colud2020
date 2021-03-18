package com.atgaoyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/18 8:39
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway9000Application {

    public static void main(String[] args) {

        SpringApplication.run(Gateway9000Application.class, args);
    }
}
