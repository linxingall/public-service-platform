package com.ygjt.gdn.psp.controller.common.valid.handle;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;

/**
 * @author jinwx
 * @version $Id: BaseValidate.java, v 0.1 May 13, 2015 8:45:34 PM jinwx Exp $
 * @since 1.0
 */
public class BaseValidate {

    private static final Logger logger = Logger.getLogger(BaseValidate.class);


    /**
     * 校验字段长度,格式是否正确
     * @param obj
     * @param <T>
     * @return
     */
    protected <T> String checkRegex(T obj) {
        try {
            String result = null;
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                if (field.getModifiers() == 26 || field.getModifiers() == 18)
                    continue;
                if (field.getType() != String.class)
                    continue;
                field.setAccessible(true);//可以访问私有变量
                Validate check = field.getAnnotation(Validate.class);
                if (check == null) {
                    continue;
                }
                int maxLength = check.maxLength();
                Object value = field.get(obj);
                if (!check.notNull() && StringUtils.isEmpty((String) value)) {
                    continue;
                }
                if (maxLength > 0) {
                    if (value != null && StringUtils.length((String) value) > maxLength) {
                        result = check.fileName() + " 格式不正确，最大长度不能超过" + maxLength + "字节,当前长度为:" + ((String) value).length();
                        break;
                    }
                }


                String regex = check.regex();
                if (StringUtils.isEmpty(regex)) {
                    boolean numAndCharRegex = check.numAndChar();
                    boolean numeralRegex = check.numeral();
                    boolean character = check.character();
                    boolean money = check.money();
                    //数字字母校验
                    if (numAndCharRegex) {
                        if (!((String) value).matches("[\\w\\d\\u4e00-\\u9fa5]*")) {
                            result = check.fileName() + "格式不正确,应该为数字或者字母";
                            break;
                        }
                    }

                    //数字校验
                    if (numeralRegex) {
                        if (!((String) value).matches("[\\d]*")) {
                            result = check.fileName() + "格式不正确，应该为数字";
                            break;
                        }
                    }

                    //字母校验
                    if (character) {
                        if (!((String) value).matches("[\\w\\u4e00-\\u9fa5]*")) {
                            result = check.fileName() + "格式不正确应该为字母";
                            break;
                        }
                    }

                    //金额校验
                    if (money) {
                        if (!((String) value).matches("(([0-9]|([1-9][0-9]+))(\\.[0-9]{1,2}))|([1-9])|([1-9][0-9]+)")) {
                            result = check.fileName() + "格式不正确,金额必须为数字，最多小数精确到两位";
                            break;
                        }
                    }

                    continue;
                }else{
                    if (!((String) value).matches(regex)) {
                        result = check.fileName() + "格式不正确";
                        break;
                    }
                }

            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /**
     *
     * @param obj
     * @param <T>
     * @return
     */
    protected <T> String checkNull(T obj) {
        try {

            String result = null;
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                if (field.getModifiers() == 26 || field.getModifiers() == 18)
                    continue;
                if (field.getType() != String.class)
                    continue;
                field.setAccessible(true);

                Validate check = field.getAnnotation(Validate.class);
                if (check == null) {
                    continue;
                }
                if (!check.notNull()) {
                    continue;
                }
                Object value = field.get(obj);
                if (StringUtils.isEmpty((String) value)) {
                    result = check.fileName() + " 不能为空";
                    break;
                }
            }

            return result;
        } catch (Exception e) {
            logger.error(e);
            throw new RuntimeException(e);
        }
    }
}
