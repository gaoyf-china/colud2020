package com.atgaoyf.springcloud.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/24 22:06
 */
public interface GaoInput {
    String GAOYF = "gaoyf";

    @Input(GaoInput.GAOYF)
    SubscribableChannel input();
}
