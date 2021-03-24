package com.atgaoyf.springcloud.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/24 22:34
 */
public interface GaoInputTwo {
    String GAOYFTWO = "gaoyftwo";

    @Input(GaoInputTwo.GAOYFTWO)
    SubscribableChannel input();
}
