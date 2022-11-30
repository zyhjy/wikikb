package com.zyh.wikikb.service;


import com.zyh.wikikb.domain.Ebook;
import com.zyh.wikikb.mapper.EbookMapper;
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
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
