package com.atgaoyf.springcloud.controller;

import com.atgaoyf.springcloud.entities.CommonResult;
import com.atgaoyf.springcloud.entities.Payment;
import com.atgaoyf.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/3 16:20
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/add")
    public CommonResult<Integer> insert(@RequestBody Payment payment) {

        int result = paymentService.insert(payment);

        if(result > 0) {

            log.info("插入成功");
            return new CommonResult<>(200, "成功", result);
        } else {

            return new CommonResult<>(444, "失败");
        }

    }

    @GetMapping("/find/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") int id) {

        Payment payment = paymentService.getPaymentById(id);

        if(payment != null) {

            return new CommonResult<>(200, "成功", payment);
        } else {

            return new CommonResult<>(444, "失败");
        }
    }

    @DeleteMapping("/remove/{id}")
    public CommonResult<Integer> remove(@PathVariable("id") int id) {

        int result = paymentService.deleteById(id);

        if(result > 0) {

            log.info("删除成功");
            return new CommonResult<>(200, "成功", result);
        } else {

            return new CommonResult<>(444, "失败");
        }
    }
}
