package com.zyh.wikikb.controller;

import com.zyh.wikikb.domain.Demo;
import com.zyh.wikikb.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author zyh
 * @Date 2022/11/30 10:45
 * @Version 1.0
 */

@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/demo/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
