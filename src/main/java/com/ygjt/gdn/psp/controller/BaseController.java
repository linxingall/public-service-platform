package com.ygjt.gdn.psp.controller;

import com.octo.captcha.service.CaptchaServiceException;
import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.model.UserDo;
import com.ygjt.gdn.psp.utils.Constants;
import com.ygjt.gdn.psp.utils.jcapcha.CaptchaServiceSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 *
 */
@Controller
public class BaseController {
    private final static Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected UserDo getSessionUserAgent(HttpServletRequest request) throws ServiceException{
        UserDo userAgent =(UserDo)request.getSession().getAttribute(Constants.USER_AGENT_IN_REQUEST);
        if(userAgent==null){
            throw new ServiceException("用户未登陆");
        }
        return userAgent;

    }

    public HttpSession getSession(HttpServletRequest request) {
        return request.getSession();
    }

    public void writeWithUtf8(String str,HttpServletResponse response){
        try {
            response.setContentType("text/html");
            response.setCharacterEncoding("utf-8");
            PrintWriter pw=response.getWriter();
            pw.write(str);
            pw.flush();
        } catch (Exception e) {
            logger.error("系统异常",e);
        }
    }
    public void writeJsonWithUtf8(String str,HttpServletResponse response){
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            PrintWriter pw=response.getWriter();
            pw.write(str);
            pw.flush();
        } catch (Exception e) {
            logger.error("系统异常",e);
        }
    }


    /**
     * 校验校验码是否正确
     * @param valid
     * @return
     */
    protected boolean checkValidImg(String valid,HttpServletRequest request)throws ServiceException{
            boolean b=false;
            try {
                if(!CaptchaServiceSingleton.getInstance().validateResponseForID(request.getSession().getId(), valid.toLowerCase())){
                    throw new ServiceException("验证码有误");
                }
                b=true;
            } catch (CaptchaServiceException e) {
                logger.debug(e.getMessage());
               throw new ServiceException("验证码有误");
            }
            return b;

    }

}
