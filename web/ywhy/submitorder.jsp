<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"+request.getContextPath()+"/";
    String path1=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<title>填写业务跟踪单</title>
<!--Custom Theme files-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet" id="templatecss" type="text/css" href="css/dark-matter.css">
<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css?v=5.4.4" />
<!--//web-fonts-->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script> 
<script type="text/javascript" src="js/jquery.mmenu.min.all.js?v=5.4.4"></script>
<!-- //js -->
<!-- chart -->
<script src="js/Chart.js"></script>
<script src="js/submitorder.js"></script>
<script src="js/jquery.form.js"></script>
<script type="text/javascript">
    var t = null;
    t = setTimeout(time,1000);
    function time()
    {
        clearTimeout(t);//清除定时器
        dt = new Date();
        var h=dt.getHours();//获取时
        var m=dt.getMinutes();//获取分
        var s=dt.getSeconds();//获取秒
        document.getElementById("showTime").innerHTML = "系统时间 "+h+":"+m+":"+s;
        t = setTimeout(time,1000); //设定定时器，循环运行
    }
</script>
    <script>
        window.onload =function() {
            var user_id="${ sessionScope.userid}";
            queryOrderSupportGroup(user_id,"<%=path1%>");
        };

    </script>
<!-- //chart -->
</head>
<body>
	<!-- main -->
	<div  class=" mm-wrapper"  id="page">
		<!--mobile-slider-->
			<div class="banner">
				<div class="header-top">
					<ul>
						<li id="showTime"></li>
					</ul>
				</div>
				<div class="banner-text">
					<section class="ac-container">
						<div class="menu">
							<input id="ac-5" name="accordion-1" type="checkbox" />
							<label for="ac-5"><img src="images/menu-icon.png" alt=""/></label>
							<article class="ac-medium">
								<ul class="nav">
									<li><a href="ownpage.jsp">主页</a></li>
                                    <li><a onclick="logOut('<%=path1%>')" href="#">退出登录</a></li>
								</ul>
							</article>
						</div>
					</section>
					<div class="title">
						<div class="title-left">
							<img src="images/img1.jpg" alt=""/>
						</div>
						<div class="title-right">
							<h2>${ sessionScope.username}</h2>
							<h6>${ sessionScope.rolename}</h6>
						</div>
						<div class="clear"> </div>
					</div>
				</div>
			</div>
			<div class="profile-slider">
				<script>
					// You can also use "$(window).load(function() {"
					$(function () {
					  // Slideshow 4
					  $("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:false,
							speed: 400,
							namespace: "callbacks"
							  });

							});
				</script>
				<div class="callbacks_container">
				
	<form id="form1" class="dark-matter">
        <input type="hidden" name="orderUserId" placeholder="例如：王先生" value="${ sessionScope.userid}"/>
		<center><h1>业务跟踪单
			<span>请填写商机信息，包括用户的需求、地址、联系电话等</span>
		</h1></center>
		<label>
			<span>所属区域:</span>
			<select id="orderArea" name="orderArea">
				<option value="百花">百花</option>
				<option value="红旗">红旗</option>
				<option value="红枫">红枫</option>
				<option value="站街">站街</option>
				<option value="卫城">卫城</option>
				<option value="其他">其他</option>
			</select>
		</label>
		<label>
			<span>用户姓名 :</span>
			<input id="orderUserName" type="text" name="orderUserName" placeholder="例如：王先生" />
		</label>
		<label>
			<span>用户联系电话 :</span>
			<input id="orderTele" type="text" name="orderTele" placeholder="例如：18984329139" />
		</label>

		<label>
			<span>用户需求 :</span>
			<textarea id="orderText" name="orderText" placeholder="用户具体需求"></textarea>
		</label>
		<label>
			<span>选择销售支撑 :</span>
            <select id="orderSupportId" name="orderSupportId">

			</select>
		</label>
		<label>

			<input type="button" class="button" value="提交工单" onclick="chechkInputAfterSubmit('<%=path1%>')"/>
		</label>
	</form>
					
					<div class="clear"> </div>
					<script src="js/responsiveslides.min.js"></script>
						 
				</div>
			
			</div>
		
		<!--//mobile-slider-->
	</div>			
</body>
</html>