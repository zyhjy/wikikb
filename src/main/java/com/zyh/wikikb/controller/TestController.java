package com.zyh.wikikb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zyh
 * @Date 2022/11/29 0:45
 * @Version 1.0
 */
@RestController
public class TestController {

    @Value("${test.hello:fasd}")
    private String testhello;
    @GetMapping("/hello")
    public String hello(){
        return "hello world"+testhello;
    }
}
