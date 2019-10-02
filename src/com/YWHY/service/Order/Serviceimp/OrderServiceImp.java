package com.YWHY.service.Order.Serviceimp;

import com.YWHY.bean.Order;
import com.YWHY.bean.more.*;
import com.YWHY.mapper.OrderRelease.OrderMapper;
import com.YWHY.service.Order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return orderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    @Override
    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public Order selectByPrimaryKey(Integer orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int selectOrderCountOfEndByPrimaryKey(Integer orderId) {
        return orderMapper.selectOrderCountOfEndByPrimaryKey(orderId);
    }

    @Override
    public int selectOrderCountOfAllByPrimaryKey(Integer orderId) {
        return orderMapper.selectOrderCountOfAllByPrimaryKey(orderId);
    }

    @Override
    public List<Order> selectOrderOfStartByPrimaryKey(Integer orderId) {
        return orderMapper.selectOrderOfStartByPrimaryKey(orderId);
    }

    @Override
    public int updateOrderDefByPrimaryKey(OrderOfDef orderOfDef) {
        return orderMapper.updateOrderDefByPrimaryKey(orderOfDef);
    }

    @Override
    public int updateOrderSuccessByPrimaryKey(OrderOfSuccess orderOfSuccess) {
        orderMapper.updateOrderSuccessByPrimaryKey(orderOfSuccess);
        return 0;
    }

    @Override
    public List<OrderSupportGroup> selectSupportGroup(Integer userId) {
        return orderMapper.selectSupportGroup(userId);
    }

    @Override
    public List<Order> selectHistoryOrderByPrimaryKey(Integer orderId) {
        return orderMapper.selectHistoryOrderByPrimaryKey(orderId);
    }

    @Override
    public OrderDetil selectOrderByPrimaryKey(Integer orderId) {
        return orderMapper.selectOrderByPrimaryKey(orderId);
    }
}
