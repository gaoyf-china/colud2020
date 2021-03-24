package com.atgaoyf.springcloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface GaoSendChannel {
    String GAOYF = "gaoyf";

    @Output(GaoSendChannel.GAOYF)
    MessageChannel output();
}
