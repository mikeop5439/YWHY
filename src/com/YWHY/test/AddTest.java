package com.YWHY.test;
import com.YWHY.bean.Massage;
import com.YWHY.bean.Order;
import com.YWHY.bean.User;
import com.YWHY.bean.more.OrderOfDef;
import com.YWHY.service.Order.Service.OrderService;
import com.YWHY.service.UserLogin.service.UserLoginService;
import com.YWHY.tools.Md5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com/config/applicationContext.xml"})
public class AddTest {
    @Autowired
    private OrderService orderService;
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
        OrderOfDef orderOfDef=new OrderOfDef();
        orderOfDef.setOrderDefeat("太贵！");
        orderOfDef.setOrderId(1);
        orderService.updateOrderDefByPrimaryKey(orderOfDef);
    }
}
