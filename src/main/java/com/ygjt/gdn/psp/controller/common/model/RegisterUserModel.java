package com.ygjt.gdn.psp.controller.common.model;

import com.ygjt.gdn.psp.controller.common.valid.handle.Validate;

/**
 * Created by linx on 2016/8/25.
 */
public class RegisterUserModel {
    /**
     * 密码
     * tb_user.PWD
     */
    @Validate(notNull = true,maxLength = 60,fileName = "密码")
    private String pwd;


    /**
     * 用户名
     * tb_user.NAME
     */
    @Validate(notNull = true,maxLength = 60,fileName = "用户名称")
    private String name;


    /**
     * 邮箱
     * tb_user.EMAIL
     */
    @Validate(notNull = true,maxLength = 60,fileName = "密码")
    private String email;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
