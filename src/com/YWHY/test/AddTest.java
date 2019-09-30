package com.YWHY.test;

import com.YWHY.bean.User;
import com.YWHY.service.Order.Service.OrderService;
import com.YWHY.service.ProdType.service.ProdTypeService;
import com.YWHY.service.Prods.service.ProdsService;

import com.YWHY.service.UserLogin.service.UserLoginService;
import com.YWHY.tools.Md5;
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
    @Autowired
    private UserLoginService userLoginService;
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
        System.out.println(userLoginService.selectByNameOrNumber("hdy")==null);

    }
}
