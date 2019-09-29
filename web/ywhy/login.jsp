<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport"
        content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>Amaze UI Examples</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="stylesheet" href="css/amazeui.min.css">
  <link rel="stylesheet" href="css/app.css">
</head>
<body>
<div class="am-g myapp-login">
	<div class="myapp-login-logo-block">
		<div class="myapp-login-logo">
			<i><img src="img/ctc.png" width="50%" ></i>
		</div>
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
				营维合一<span>支撑管理系统</span>
				<div class="info">中国电信股份有限公司清镇分公司</div>
			</div>
		</div>

		<div class="login-font">
			<i>Log In </i> or <span> Sign Up</span>
		</div>
		<div class="am-u-sm-10 login-am-center">
			<form  id="form1" class="am-form">
				<fieldset>
					<div class="am-form-group">
						<input type="text" name="userName" id="userName" class="" id="doc-ipt-email-1" placeholder="输入您的工号">
					</div>

					<div class="am-form-group">
						<input type="password" name="userPwd" id="userPwd" class="" id="doc-ipt-pwd-1" placeholder="输入您的密码">
					</div>
					<p><button type="button" class="am-btn am-btn-default" onclick="chechkInputAfterSubmit()">登陆</button></p>
				</fieldset>
			</form>
		</div>
	</div>
</div>
<center><p style="color:white;">版权所有 © 中国电信股份有限公司清镇分公司<br>

运维邮箱 18984329139@189.com
</p></center>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="js/amazeui.min.js"></script>
<script src="js/app.js"></script>
<script src="js/jquery.form.js"></script>
<script type="text/javascript">
    function chechkInputAfterSubmit(){
        if(checkInput()){
            submitForm();
        }else{
            return false;
        }

    }

    function checkInput(){
        var flag = true;
        //判断用户名
        if($("input[name=userName]").val()==null || $("input[name=userName]").val()==""){
            alert("用户名不能等于空");
            $("input[name=userName]").focus();
            flag =false;
            return ;
        }
        //判断密码
        if($("input[name=userPwd]").val()==null || $("input[name=userPwd]").val()==""){
            alert("手机号不能等于空");
            $("input[name=userPwd]").focus();
            flag =false;
            return ;
        }else if($("input[name=userPwd]").val().length<=6 || $("input[name=userPwd]").val().length>=15){
            alert('请输入有效的密码,密码长度在6到15位');
            $("input[name=userPwd]").focus();
            flag =false;
            return ;
        }
        return flag;
    }

    function submitForm() {
        var option = {
            url : '${pageContext.request.contextPath }/user/login.action',
            type : 'POST',
            dataType : 'json',
            headers : {"ClientCallMode" : "ajax"}, //添加请求头部
            success : function(data) {
                if(data.massage=='登陆失败'){
                    alert(data.massage+":工号或密码错误！")
                }else{
                    window.location.href="${pageContext.request.contextPath }/ywhy/ownpage.jsp";
                }
            }
        };
        $("#form1").ajaxSubmit(option);

    }
</script>
</body>
</html>