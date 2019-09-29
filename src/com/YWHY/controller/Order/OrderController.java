package com.YWHY.controller.Order;

import com.YWHY.bean.Order;
import com.YWHY.bean.more.OrderCount;
import com.YWHY.bean.more.OrderOfDef;
import com.YWHY.bean.more.OrderOfDefJson;
import com.YWHY.service.Order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    //查询商机数量
    @RequestMapping("queryCount")
    public @ResponseBody OrderCount queryCount(String user_id){
        OrderCount orderCount=new OrderCount();
        orderCount.setOrder_all_count(String.valueOf(orderService.selectOrderCountOfAllByPrimaryKey(Integer.parseInt(user_id))));
        orderCount.setOrder_ent_count(String.valueOf(orderService.selectOrderCountOfEndByPrimaryKey(Integer.parseInt(user_id))));
        return  orderCount;
    }
    //查询进行中的商机
    @RequestMapping("queryOrder")
    public @ResponseBody List<Order> queryOrder(String user_id){
        int userid=Integer.parseInt(user_id);
        return  orderService.selectOrderOfStartByPrimaryKey(userid);
    }
    //商机失败回单
    @RequestMapping("submitOrderOfDef")
    public @ResponseBody int submitOrderOfDef(@RequestBody OrderOfDef orderOfDef){
        System.out.println(orderOfDef.toString());
        //orderService.updateOrderDefByPrimaryKey(orderOfDef);
        return  1;
    }

}
