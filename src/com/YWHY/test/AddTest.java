package com.YWHY.test;

import com.YWHY.service.Order.Service.OrderService;
import com.YWHY.service.ProdType.service.ProdTypeService;
import com.YWHY.service.Prods.service.ProdsService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.sql.Timestamp;
import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/config/applicationContext.xml"})
public class AddTest {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProdTypeService  prodTypeService;
    @Autowired
    private ProdsService prodsService;
//    @Test
//    public void test1(){
//        Md5 md5=new Md5();
//        User user=new User();
//        user.setUserName("hdy");
//        user.setUserPwd(md5.md5("mike5439"));
//        Massage massage=new Massage();
//        String pwd;
//        pwd=md5.md5(user.getUserPwd());
//        System.out.println(userLoginService.selectByName(user.getUserName()).getUserPwd());
//        System.out.println(pwd);
//        if (userLoginService.selectByName(user.getUserName()).getUserPwd().equals(pwd)){
//            massage.setMassage("登陆成功");
//            System.out.println(massage.getMassage());
//        }else{
//            massage.setMassage("登陆失败");
//            System.out.println(massage.getMassage());
//
//        }
//    }
    @Test
    public void test2(){
//       Prods prods=new Prods();
//       prods.setOrderId(2);
//       prods.setProdAccount("18984329139");
//       prods.setProdTypeId(2);
//       prodsService.insert(prods);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime()); //2013-01-14 22:45:36.484

        System.out.println(timestamp);
        //System.out.println(prodsService.selectByPrimaryKey(1).toString());
    }
}
