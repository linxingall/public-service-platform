package com.ygjt.gdn.psp.persistence;

import com.ygjt.gdn.psp.model.OrderDo;
import com.ygjt.gdn.psp.model.OrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {
    /**
     * tb_order
     */
    int countByQuery(OrderQuery example);

    /**
     * tb_order
     */
    int deleteByQuery(OrderQuery example);

    /**
     * tb_order
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * tb_order
     */
    int insert(OrderDo record);

    /**
     * tb_order
     */
    int insertSelective(OrderDo record);

    /**
     * tb_order
     */
    List<OrderDo> selectByQuery(OrderQuery example);

    /**
     * tb_order
     */
    OrderDo selectByPrimaryKey(Integer id);

    /**
     * tb_order
     */
    int updateByQuerySelective(@Param("record") OrderDo record, @Param("example") OrderQuery example);

    /**
     * tb_order
     */
    int updateByQuery(@Param("record") OrderDo record, @Param("example") OrderQuery example);

    /**
     * tb_order
     */
    int updateByPrimaryKeySelective(OrderDo record);

    /**
     * tb_order
     */
    int updateByPrimaryKey(OrderDo record);
}