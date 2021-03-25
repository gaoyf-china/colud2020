package com.atgaoyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021.3.25 9:01
 */
@SpringBootApplication
@EnableEurekaClient
public class Sleuth4000Application {

    public static void main(String[] args) {

        SpringApplication.run(Sleuth4000Application.class, args);
    }
}
