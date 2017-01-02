package com.ygjt.gdn.psp.service;

import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.model.GoodsDo;
import com.ygjt.gdn.psp.model.GoodsQuery;
import com.ygjt.gdn.psp.utils.SPage;

/**
 * Created by linx on 2017-01-02.
 */
public interface GoodsService {
    SPage<GoodsDo> list(GoodsQuery query, int pageNum, int pageSize)
            throws ServiceException;
}
