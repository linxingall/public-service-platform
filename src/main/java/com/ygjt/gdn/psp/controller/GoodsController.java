package com.ygjt.gdn.psp.controller;

import com.ygjt.gdn.psp.controller.vo.po.GoodsPO;
import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.model.GoodsDo;
import com.ygjt.gdn.psp.model.GoodsQuery;
import com.ygjt.gdn.psp.model.UserDo;
import com.ygjt.gdn.psp.service.GoodsService;
import com.ygjt.gdn.psp.utils.SPage;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by linx on 2017-01-02.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController extends BaseController{
    @Autowired
    GoodsService goodsService;

    @RequestMapping("list")
    public ModelAndView list(Model model, GoodsPO goodsPO,
                             @RequestParam(value = "pageNo", defaultValue = "1") String pageNo) throws ServiceException {

        GoodsQuery example = new GoodsQuery();
        GoodsQuery.Criteria criteria = example.createCriteria();
        example.setOrderByClause("CREATED_DT desc");
        SPage<GoodsDo> pageList = goodsService.list(example, Integer.parseInt(pageNo), 10);
        model.addAttribute("page", pageList);
        model.addAttribute("goodsPO", goodsPO);
        return new ModelAndView("goods/goodsList");
    }
}
