package com.ygjt.gdn.psp.persistence;

import com.ygjt.gdn.psp.model.OrderGoodsDo;
import com.ygjt.gdn.psp.model.OrderGoodsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsDao {
    /**
     * tb_order_goods
     */
    int countByQuery(OrderGoodsQuery example);

    /**
     * tb_order_goods
     */
    int deleteByQuery(OrderGoodsQuery example);

    /**
     * tb_order_goods
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * tb_order_goods
     */
    int insert(OrderGoodsDo record);

    /**
     * tb_order_goods
     */
    int insertSelective(OrderGoodsDo record);

    /**
     * tb_order_goods
     */
    List<OrderGoodsDo> selectByQuery(OrderGoodsQuery example);

    /**
     * tb_order_goods
     */
    OrderGoodsDo selectByPrimaryKey(Integer id);

    /**
     * tb_order_goods
     */
    int updateByQuerySelective(@Param("record") OrderGoodsDo record, @Param("example") OrderGoodsQuery example);

    /**
     * tb_order_goods
     */
    int updateByQuery(@Param("record") OrderGoodsDo record, @Param("example") OrderGoodsQuery example);

    /**
     * tb_order_goods
     */
    int updateByPrimaryKeySelective(OrderGoodsDo record);

    /**
     * tb_order_goods
     */
    int updateByPrimaryKey(OrderGoodsDo record);
}