package com.ygjt.gdn.psp.persistence;

import com.ygjt.gdn.psp.model.UserDo;
import com.ygjt.gdn.psp.model.UserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    /**
     * tb_user
     */
    int countByQuery(UserQuery example);

    /**
     * tb_user
     */
    int deleteByQuery(UserQuery example);

    /**
     * tb_user
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * tb_user
     */
    int insert(UserDo record);

    /**
     * tb_user
     */
    int insertSelective(UserDo record);

    /**
     * tb_user
     */
    List<UserDo> selectByQuery(UserQuery example);

    /**
     * tb_user
     */
    UserDo selectByPrimaryKey(Integer id);

    /**
     * tb_user
     */
    int updateByQuerySelective(@Param("record") UserDo record, @Param("example") UserQuery example);

    /**
     * tb_user
     */
    int updateByQuery(@Param("record") UserDo record, @Param("example") UserQuery example);

    /**
     * tb_user
     */
    int updateByPrimaryKeySelective(UserDo record);

    /**
     * tb_user
     */
    int updateByPrimaryKey(UserDo record);
}