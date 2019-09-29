package com.YWHY.mapper.OrderRelease;

import com.YWHY.bean.Order;
import com.YWHY.bean.more.OrderOfDef;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int selectOrderCountOfEndByPrimaryKey(Integer orderId);

    int selectOrderCountOfAllByPrimaryKey(Integer orderId);

    List<Order> selectOrderOfStartByPrimaryKey(Integer orderId);

    int updateOrderDefByPrimaryKey(OrderOfDef orderOfDef);
}