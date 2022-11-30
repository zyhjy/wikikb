package com.zyh.wikikb.service;

import com.zyh.wikikb.domain.Test;
import com.zyh.wikikb.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author zyh
 * @Date 2022/11/29 23:24
 * @Version 1.0
 */

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
