package com.atgaoyf.springcloud.service.impl;

import cn.hutool.Hutool;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.NumberUtil;
import com.atgaoyf.springcloud.GaoSendChannel;
import com.atgaoyf.springcloud.entities.Payment;
import com.atgaoyf.springcloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/24 21:38
 */
@EnableBinding(GaoSendChannel.class)
public class MessageService implements IMessageService {

    @Autowired
    @Qualifier(GaoSendChannel.GAOYF)
    private MessageChannel messageChannel;

    @Override
    public void sendMessage() {

        Payment payment = new Payment();
        payment.setId(NumberUtil.generateRandomNumber(0, 100, 1)[0]);
        payment.setSerial(IdUtil.randomUUID());
        messageChannel.send(MessageBuilder.withPayload(payment).build());
    }
}
