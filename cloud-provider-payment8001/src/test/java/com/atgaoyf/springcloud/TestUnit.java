package com.atgaoyf.springcloud;

import com.atgaoyf.springcloud.entities.Payment;
import com.atgaoyf.springcloud.service.IPaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/3 16:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUnit {

    @Autowired
    private IPaymentService paymentService;

    @Test
    public void testFirst() {

        Payment payment = new Payment("2222222");
        paymentService.insert(payment);
    }
}
