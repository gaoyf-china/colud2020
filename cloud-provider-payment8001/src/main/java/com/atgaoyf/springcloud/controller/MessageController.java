package com.atgaoyf.springcloud.controller;

import com.atgaoyf.springcloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoyf
 * @Desc //TODO添加描述
 * @Date 2021/3/24 21:37
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private IMessageService messageService;

    @GetMapping("/send")
    public String sendMessage() {

        messageService.sendMessage();

        return "success";
    }
}
