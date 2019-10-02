<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path1=request.getContextPath();
	String path=request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<title>工单跟踪</title>
<!--Custom Theme files-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Custom Theme files-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css?v=5.4.4" />
<!--js-->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/submitorder.js"></script>
<script type="text/javascript" src="js/jquery.mmenu.min.all.js?v=5.4.4"></script>
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
	<script >
        window.onload =function() {
            var user_id="${ sessionScope.userid}";
            queryOrderCount(user_id,"<%=path1%>");
            queryHistoryOrder(user_id,"<%=path1%>");
        };
	</script>
<!-- //js -->
</head>
<body>
		<div class=" mm-wrapper"  id="page">
			<div class="push-menu ">
				<div class="banner">
					<div class="header-top">
						<ul>
							<li id="showTime"></li>
						</ul>
					</div>
					<div class="banner-text">
						<div class="menu">
							<a href="#menu"><img src="images/menu-icon.png" alt=""/></a>
							<nav id="menu">
								<ul class="">
									<li class="menu-title">菜单</li>
									<li><a href="yd.jsp"><span class="icons icn2"> </span>发起工单</a></li>
									<li><a href="ownpage.jsp"><span class="icons icn1"> </span>在途工单</a></li>
									<li><a href="historyorder.jsp"><span class="icons icn3"> </span> 历史工单</a></li>
									<li><a href="#"><span class="icons icn4"> </span> 设置</a></li>
									<li><a onclick="logOut('<%=path%>')"  href="#"><span class="icons icn5"> </span> 退出</a></li>
								</ul>
							</nav>
								<script type="text/javascript">
									$(function() {
										$("#menu")
											.mmenu({
								extensions 	: [ "theme-dark", "effect-listitems-slide" ],
								iconPanels	: {
									add 		: true,
									visible		: 1
								},
								navbar		: {
									add 		: false
								},
								counters	: true
											}).on( 'click',
												'a[href^="#/"]',
												function() {
													alert( "Thank you for clicking, but that's a demo link." );
													return false;
												}
											);
									});
								</script>
							<!-- /script-for-menu -->
						</div>
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
				<div class="clear"> </div>
				<div class="banner-bottom">
					<div class="banner-bottom-left">
						<h3 id="order_all_count">NULL</h3>
						<p>发现商机</p>
					</div>
					<div class="banner-bottom-right">
						<h3 id="order_end_count">NULL</h3>
						<p>完成商机</p>
					</div>
					<div class="clear"> </div>
				</div>
				<div id="gzdiv" class="work-text">
					<h3>正在跟踪</h3>
					<section id="information-area" class="ac-container">
					</section>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript" src="js/historyorder.js">
</script>
</html>