package com.zyh.wikikb.service;

import com.zyh.wikikb.domain.Demo;
import com.zyh.wikikb.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author zyh
 * @Date 2022/11/30 10:45
 * @Version 1.0
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }

}
