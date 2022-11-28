package com.zyh.wikikb.controller;

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

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
