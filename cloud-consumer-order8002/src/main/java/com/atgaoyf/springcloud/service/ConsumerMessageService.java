package com.atgaoyf.springcloud.service;

import com.atgaoyf.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/24 22:04
 */
@EnableBinding({GaoInput.class, GaoInputTwo.class})
@Slf4j
public class ConsumerMessageService {

    @StreamListener(GaoInput.GAOYF)
    public void consumerMessage(Payment payment) {

        log.info("receive msg: payment id:{},serial:{}", payment.getId(), payment.getSerial());
    }

    @StreamListener(GaoInputTwo.GAOYFTWO)
    public void consumerMessage2(Payment payment) {

        log.info("receive msg: payment id:{},serial:{}", payment.getId(), payment.getSerial());
    }
}
