package com.ygjt.gdn.psp.service.impl;

import com.ygjt.gdn.psp.enums.UserEnum;
import com.ygjt.gdn.psp.exception.ServiceException;
import com.ygjt.gdn.psp.model.UserDo;
import com.ygjt.gdn.psp.model.UserQuery;
import com.ygjt.gdn.psp.persistence.UserDao;
import com.ygjt.gdn.psp.service.UserService;
import com.ygjt.gdn.psp.utils.SHA1;
import com.ygjt.gdn.psp.utils.UUIDUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by linx on 2016/8/23.
 */
@Service("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    public void save(UserDo userDo) throws ServiceException {
        isExistName(userDo.getName());
        userDo.setStat(UserEnum.USER_STAT.YES.getValue());
        userDo.setType(UserEnum.USER_TYPE.COMPANY.getValue());
        userDao.insert(userDo);
    }

    @Override
    public boolean isExistName(String name) {
        if(StringUtils.isEmpty(name)){
            return  false;
        }
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andNameEqualTo(name);
        if(userDao.countByQuery(userQuery)>0){
            return false;
        }
        return true;
    }

    @Override
    public UserDo loginByNameAndEamil(UserDo userDo) throws ServiceException {
        UserQuery userQuery = new UserQuery();
        userQuery.createCriteria().andNameEqualTo(userDo.getName());
        List<UserDo> userDos = userDao.selectByQuery(userQuery);
        if(userDos==null ||userDos.size()==0){
            throw new ServiceException("用户不存在");
        }
        UserDo resUser = userDos.get(0);
//        if(!new SHA1().getDigestOfString((userDo.getPwd()+resUser.getSecretKey()).getBytes()).equals(resUser.getPwd())){
//            throw new ServiceException("用户名或密码有误");
//        }
        return resUser;
    }
}
