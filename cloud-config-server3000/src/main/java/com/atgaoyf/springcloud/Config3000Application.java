package com.atgaoyf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gaoyf
 * @Desc //
 * @Date 2021/3/19 11:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Config3000Application {

    public static void main(String[] args) {

        SpringApplication.run(Config3000Application.class, args);
    }
}
