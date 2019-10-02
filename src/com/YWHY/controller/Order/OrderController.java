package com.YWHY.controller.Order;

import com.YWHY.bean.Order;
import com.YWHY.bean.Prods;
import com.YWHY.bean.more.*;
import com.YWHY.service.Order.Service.OrderService;
import com.YWHY.service.Prods.service.ProdsService;
import com.YWHY.tools.DateConver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
    //查询支撑组
    @RequestMapping("querySupportGroup")
    public @ResponseBody List<OrderSupportGroup> querySupportGroup(String user_id){
        int userId=Integer.parseInt(user_id);
        return  orderService.selectSupportGroup(userId);
    }
    //提交业务跟踪单
    @RequestMapping("submitOrder")
    public @ResponseBody int submitOrder(Order order){
        order.setOrderStatus(0);
        orderService.insert(order);
        return  1;
    }
    //查询全部历史商机
    @RequestMapping("queryHistoryOrder")
    public @ResponseBody List<Order> queryHistoryOrder(String user_id){
        int userid=Integer.parseInt(user_id);
        return  orderService.selectHistoryOrderByPrimaryKey(userid);
    }
    //查询历史商机通过商机ID
    @RequestMapping("queryHistoryOrderByOrderId")
    public String queryHistoryOrderByOrderId(String orderId,Model model ){
        DateConver dateConver=new DateConver();
        OrderDetil orderDetil=new OrderDetil();
        UsedTime usedTime=new UsedTime();
        orderDetil=orderService.selectOrderByPrimaryKey(Integer.parseInt(orderId));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        usedTime.setOrderEndDate(sdf.format(orderDetil.getOrderEndDate()));
        usedTime.setOrderStartDate(sdf.format(orderDetil.getOrderStartDate()));
        usedTime.setUsedTime(dateConver.getDatePoor(orderDetil.getOrderEndDate(),orderDetil.getOrderStartDate()));
        model.addAttribute("orderDetil",orderDetil);
        model.addAttribute("usedTime",usedTime);
        if (orderDetil.getOrderStatus()==1){
            model.addAttribute("prods",prodsService.selectProdsNameAndAccount(Integer.parseInt(orderId)));
        }
        return "forward:/ywhy/historyDetil.jsp";
    }
}
