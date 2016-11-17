package com.ygjt.gdn.psp.controller.common.valid.handle;

import com.ygjt.gdn.psp.exception.ValidateException;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 校验
 *
 * @author jinwx
 * @version $Id: ValidateImpl.java, v 0.1 May 13, 2015 8:51:43 PM jinwx Exp $
 * @since 1.0
 */
@Component("validateHandle")
public class ValidateHandleImpl extends BaseValidate implements IValidateHandle {

    private static final Logger logger = Logger.getLogger(ValidateHandleImpl.class);


    public <T> void validate(T request) throws ValidateException {
        try {
            String nullResult = super.checkNull(request);//非空校验
            if (nullResult != null) {
                throw new ValidateException(nullResult);
            }
            // 字段长度校验
            String result = super.checkRegex(request);
            if (result != null) {
                throw new ValidateException(result);
            }
        } catch (ValidateException e) {
            throw e;
        } catch (Exception e) {
            logger.error("系统异常", e);
            throw new ValidateException(e);
        }

    }


}
