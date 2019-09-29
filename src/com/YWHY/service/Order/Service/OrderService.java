package com.YWHY.service.Order.Service;

import com.YWHY.bean.Order;
import com.YWHY.bean.more.OrderOfDef;

import java.util.List;

public interface OrderService {
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
