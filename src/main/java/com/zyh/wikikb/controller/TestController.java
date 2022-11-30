package com.zyh.wikikb.controller;

import com.zyh.wikikb.domain.Test;
import com.zyh.wikikb.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world"+testhello;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
