package com.YWHY.controller.User;


import com.YWHY.bean.Massage;

import com.YWHY.bean.Role;
import com.YWHY.bean.User;
import com.YWHY.service.Order.Service.OrderService;
import com.YWHY.service.UserLogin.service.RoleLoginService;
import com.YWHY.service.UserLogin.service.UserLoginService;
import com.YWHY.tools.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserLoginService userLoginService;
    @Autowired
    private RoleLoginService roleLoginService;
    @RequestMapping("login")
    public @ResponseBody
    Massage bxForm(User user, HttpSession session){
        Role role=new Role();
        Md5 md5=new Md5();
        String pwd;
        int user_role;
        int user_id;
        pwd=md5.md5(user.getUserPwd());
        Massage massage=new Massage();
        if (userLoginService.selectByName(user.getUserName()).getUserPwd().equals(pwd)){
            user=userLoginService.selectByName(user.getUserName());
            user_role=user.getUserRole();
            user_id=user.getUserId();
            role=roleLoginService.selectByPrimaryKey(user_role);
            massage.setMassage("登陆成功");
            session.setAttribute("username", user.getUserName());
            session.setAttribute("rolename", role.getRoleName());
            session.setAttribute("userid", user_id);
            return massage;
        }else{
            massage.setMassage("登陆失败");
            session.setAttribute("msg", "工号或密码错误！");
            return massage;

        }
    }
    @RequestMapping("logout")
    public @ResponseBody Massage logOut(HttpSession session){
        Massage massage=new Massage();
        session.removeAttribute("username");
        session.removeAttribute("rolename");
        session.removeAttribute("userid");
        massage.setMassage("登出成功");
        return massage;
    }

}
