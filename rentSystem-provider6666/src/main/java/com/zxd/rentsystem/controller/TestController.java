package com.zxd.rentsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
@Slf4j
public class TestController {

    @GetMapping("/get")
    public String get(){
        log.error("测试函数计算FC");
        return "hello world!";
    }
}
