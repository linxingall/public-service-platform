package com.ygjt.gdn.psp.persistence;

import com.ygjt.gdn.psp.model.GoodsDo;
import com.ygjt.gdn.psp.model.GoodsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsDao {
    /**
     * tb_goods
     */
    int countByQuery(GoodsQuery example);

    /**
     * tb_goods
     */
    int deleteByQuery(GoodsQuery example);

    /**
     * tb_goods
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * tb_goods
     */
    int insert(GoodsDo record);

    /**
     * tb_goods
     */
    int insertSelective(GoodsDo record);

    /**
     * tb_goods
     */
    List<GoodsDo> selectByQuery(GoodsQuery example);

    /**
     * tb_goods
     */
    GoodsDo selectByPrimaryKey(Integer id);

    /**
     * tb_goods
     */
    int updateByQuerySelective(@Param("record") GoodsDo record, @Param("example") GoodsQuery example);

    /**
     * tb_goods
     */
    int updateByQuery(@Param("record") GoodsDo record, @Param("example") GoodsQuery example);

    /**
     * tb_goods
     */
    int updateByPrimaryKeySelective(GoodsDo record);

    /**
     * tb_goods
     */
    int updateByPrimaryKey(GoodsDo record);
}