package com.ygjt.gdn.psp.controller;

import com.alibaba.fastjson.JSONObject;
import com.ygjt.gdn.psp.controller.common.model.AjaxJson;
import com.ygjt.gdn.psp.controller.common.model.LoginUserModel;
import com.ygjt.gdn.psp.controller.common.model.RegisterUserModel;
import com.ygjt.gdn.psp.controller.common.valid.handle.IValidateHandle;
import com.ygjt.gdn.psp.entity.OrderGoodsExport;
import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.exception.ValidateException;
import com.ygjt.gdn.psp.model.UserDo;
import com.ygjt.gdn.psp.service.UserService;
import com.ygjt.gdn.psp.third.YunMaYiUtil;
import com.ygjt.gdn.psp.utils.BrowserUtils;
import com.ygjt.gdn.psp.utils.Constants;
import com.ygjt.gdn.psp.utils.ExcelUtil;
import com.ygjt.gdn.psp.utils.UUIDUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

/**
 * Created by Je on 2016/6/30.
 */
@Controller
@RequestMapping("/")
public class HomeController extends BaseController{
    private static final Logger logger = Logger.getLogger(HomeController.class);
    @Autowired
    UserService userService;
    @Resource(name="validateHandle")
    IValidateHandle validateHandle;
    @RequestMapping("index")
    public String index(HttpServletRequest request,Model model) {
        try {
            UserDo userAgent= getSessionUserAgent(request);
            model.addAttribute("user", userAgent.getName());
            return "index";
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("login")
    public ModelAndView login(ModelMap model,HttpSession session,HttpServletResponse response) {
//        Object obj = session.getAttribute(UserAgent.USER_AGENT_IN_REQUEST);
//        // 判断如果没有取到用户信息，就跳转到登陆页面，提示用户进行登陆
//        if (obj != null) {
//            return new ModelAndView("redirect:/index.htm");
//        }
        return new ModelAndView("login");
    }

    @RequestMapping("doLogin")
    public void doLogin(LoginUserModel user,String validateCode,HttpSession session,HttpServletRequest request,HttpServletResponse response) {
        AjaxJson resJson = new AjaxJson();
        try {
           // checkValidImg(validateCode,request);
            validateHandle.validate(user);
            UserDo userDo = new UserDo();
            BeanUtils.copyProperties(user,userDo);
            UserDo resUser =userService.loginByNameAndEamil(userDo);
            // 验证通过，将登录信息存在session
            session.setAttribute(Constants.USER_AGENT_IN_REQUEST, resUser);
        }catch (ValidateException e) {
            resJson.setResult(false);
            resJson.setMsg(e.getMessage());
        } catch (ServiceException e) {
            resJson.setResult(false);
            resJson.setMsg(e.getMessage());
        }
        super.writeJsonWithUtf8(JSONObject.toJSONString(resJson),response);

    }

    @RequestMapping("register")
    public String register(ModelMap model) {
        return "register";
    }

    @RequestMapping("doRegister")
    public void  doRegister(
            @ModelAttribute("user") RegisterUserModel user,
            BindingResult result, String validateCode,HttpSession session,HttpServletRequest request,HttpServletResponse response) {
        AjaxJson resJson = new AjaxJson();
        try {
            checkValidImg(validateCode,request);
            validateHandle.validate(user);
            UserDo userDo = new UserDo();
            BeanUtils.copyProperties(user,userDo);
            userService.save(userDo);
            // 验证通过，将登录信息存在session
            session.setAttribute(Constants.USER_AGENT_IN_REQUEST, userDo);
            resJson.setResult(true);
        }catch (ValidateException e) {
            resJson.setResult(false);
            resJson.setMsg(e.getMessage());
        } catch (ServiceException e) {
            resJson.setResult(false);
            resJson.setMsg(e.getMessage());
        }
        super.writeJsonWithUtf8(JSONObject.toJSONString(resJson),response);

    }

    @RequestMapping("checkName")
    public void checkName(String name, HttpServletResponse response) {
        AjaxJson resJson = new AjaxJson();
        resJson.setValid(userService.isExistName(name));
        super.writeJsonWithUtf8(JSONObject.toJSONString(resJson),response);
    }
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
        return new ModelAndView("redirect:/login.htm");
    }
    @RequestMapping("checkValidImg")
    public void checkValidImg(String validateCode,HttpServletRequest request, HttpServletResponse response) {
        AjaxJson resJson = new AjaxJson();
        logger.debug("验证码："+validateCode);
        try {
            resJson.setValid(this.checkValidImg(validateCode,request));
        } catch (ServiceException e) {
            resJson.setValid(false);
        }
        super.writeJsonWithUtf8(JSONObject.toJSONString(resJson),response);
    }

    @RequestMapping("downOrdes")
    public void downOrdes( HttpServletRequest request,
                                  HttpServletResponse response) {
        response.setContentType("application/vnd.ms-excel");
        String codedFileName = null;
        OutputStream fOut = null;
        try {
            codedFileName = UUIDUtils.getPkid();
            // 根据浏览器进行转码，使其支持中文文件名
            if (BrowserUtils.isIE(request)) {
                response.setHeader(
                        "content-disposition",
                        "attachment;filename="
                                + java.net.URLEncoder.encode(codedFileName,
                                "UTF-8") + ".xls");
            } else {
                String newtitle = new String(codedFileName.getBytes("UTF-8"),
                        "ISO8859-1");
                response.setHeader("content-disposition",
                        "attachment;filename=" + newtitle + ".xls");
            }
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");
            // 产生工作簿对象
            HSSFWorkbook workbook = ExcelUtil.exportExcelNoTitle(codedFileName,
                    YunMaYiUtil.queryOrders(startDate,endDate),OrderGoodsExport.class,null);
            fOut = response.getOutputStream();
            workbook.write(fOut);
        } catch (Exception e) {
            logger.error("导出理货列表异常：",e);
        } finally {
            try {
                fOut.flush();
                fOut.close();
            } catch (IOException e) {

            }
        }
    }


}
