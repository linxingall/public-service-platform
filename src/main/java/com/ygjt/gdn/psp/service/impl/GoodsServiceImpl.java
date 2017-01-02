package com.ygjt.gdn.psp.service.impl;

import com.github.pagehelper.PageHelper;
import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.model.GoodsDo;
import com.ygjt.gdn.psp.model.GoodsQuery;
import com.ygjt.gdn.psp.persistence.GoodsDao;
import com.ygjt.gdn.psp.service.GoodsService;
import com.ygjt.gdn.psp.utils.SPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linx on 2017-01-02.
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    GoodsDao goodsDao;
    @Override
    public SPage<GoodsDo> list(GoodsQuery query, int pageNum, int pageSize) throws ServiceException {
        try {
            logger.info("[进入商品分页查询服务]");
            //设置分页信息
            PageHelper.startPage(pageNum, pageSize, true, null, true);
            List<GoodsDo> list = goodsDao.selectByQuery(query);
            SPage<GoodsDo> pageInfo = new SPage<GoodsDo>(list);
            logger.info("[商品分页查询成功,当前页=" + pageInfo.getPageNo()
                    + ",每页数量=" + pageInfo.getRows() + ",总页数=" + pageInfo.getTotal()
                    + ",总记录数=" + pageInfo.getRecords() + "]");
            return pageInfo;
        } catch (Exception e) {
            logger.error("商品分页查询服务系统异常", e);
            throw new ServiceException(e);
        }
    }
}
