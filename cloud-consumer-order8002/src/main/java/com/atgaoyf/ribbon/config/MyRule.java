package com.atgaoyf.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaoyf
 * @Desc 自定义轮训策略2232
 * @Date 2021/3/11 20:01
 */
@Configuration
public class MyRule {

    @Bean
    public IRule gaoRule() {

        return new RandomRule();
    }
}
