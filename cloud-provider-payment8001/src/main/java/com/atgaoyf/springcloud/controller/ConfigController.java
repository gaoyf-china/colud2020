package com.atgaoyf.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoyf
 * @Desc 测试读取配置文件
 * @Date 2021/3/19 11:42
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${config.version}")
    private String version;
    /*@Value("${test.aa}")
    private String aa;*/

    @GetMapping("/version")
    public  String getVersion() {

        return version;
    }
}
