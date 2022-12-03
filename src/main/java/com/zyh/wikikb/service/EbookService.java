package com.zyh.wikikb.service;


import com.zyh.wikikb.domain.Ebook;
import com.zyh.wikikb.domain.EbookExample;
import com.zyh.wikikb.mapper.EbookMapper;
import com.zyh.wikikb.req.EbookReq;
import com.zyh.wikikb.resp.EbookResp;
import com.zyh.wikikb.util.CopyUtil;
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


    public List<EbookResp> list(EbookReq ebookReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        //ArrayList<EbookResp> respList = new ArrayList<>();
        //
        //for (Ebook ebook : ebookList) {
        //    EbookResp ebookResp = new EbookResp();
        //    BeanUtils.copyProperties(ebook,ebookResp);
        //    respList.add(ebookResp);
        //}

        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;

    }
}
