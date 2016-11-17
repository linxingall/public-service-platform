package com.ygjt.gdn.psp.service;

import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.model.UserDo;

/**
 * Created by linx on 2016/8/23.
 */
public interface UserService {
    /**
     * 注册
     * @param userDo
     * @throws ServiceException
     */
    void save(UserDo userDo)throws ServiceException;

    /**
     * 用户唯一性校验
     * @param name
     * @return
     */
    boolean isExistName(String name);

    /**
     * 登录
     * @param userDo
     * @return
     * @throws ServiceException
     */
    UserDo loginByNameAndEamil(UserDo userDo)throws ServiceException;
}
