package com.atgaoyf.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/15 11:07
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLevel() {

        return Logger.Level.FULL;
    }
}
