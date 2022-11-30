package com.zyh.wikikb.controller;

import com.zyh.wikikb.domain.Ebook;
import com.zyh.wikikb.resp.CommonResp;
import com.zyh.wikikb.service.EbookService;
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
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/ebook/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }
}
