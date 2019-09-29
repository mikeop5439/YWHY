package com.YWHY.controller.Order;

import com.YWHY.bean.Order;
import com.YWHY.bean.Prods;
import com.YWHY.bean.more.OrderCount;
import com.YWHY.bean.more.OrderOfDef;
import com.YWHY.bean.more.OrderOfDefJson;
import com.YWHY.bean.more.OrderOfSuccess;
import com.YWHY.service.Order.Service.OrderService;
import com.YWHY.service.Prods.service.ProdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProdsService prodsService;
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
        orderService.updateOrderDefByPrimaryKey(orderOfDef);
        return  1;
    }

    //商机成功回单
    @RequestMapping("submitOrderOfSuccess")
    public @ResponseBody int submitOrderOfSuccess(@RequestBody OrderOfSuccess orderOfSuccess){
        orderService.updateOrderSuccessByPrimaryKey(orderOfSuccess);
        return  1;
    }
    //添加订单产品信息
    @RequestMapping("submitProds")
    public @ResponseBody int submitProds(@RequestBody Prods prods){
        prodsService.insert(prods);
        return  1;
    }
}
