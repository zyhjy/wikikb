package com.zyh.wikikb.controller;

import com.zyh.wikikb.req.EbookReq;
import com.zyh.wikikb.resp.CommonResp;
import com.zyh.wikikb.resp.EbookResp;
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

    @GetMapping("/list")
    public CommonResp list(EbookReq ebookReq){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(ebookReq);
        resp.setContent(list);
        return resp;
    }
}
