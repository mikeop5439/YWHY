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
<title>发单引导</title>
<!--Custom Theme files-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css?v=5.4.4" />
<!--//web-fonts-->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script> 
<script type="text/javascript" src="js/jquery.mmenu.min.all.js?v=5.4.4"></script>
<script src="js/submitorder.js"></script>
<!-- //js -->
<!-- chart -->
<script src="js/Chart.js"></script>
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
									<li><a href="onwayorder.jsp">主页</a></li>
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
							<h2>黄鼎运 </h2>
							<h6>社区经理</h6>
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
					<ul class="rslides" id="slider4">
						<li>
							<div class="slider-text">
								<h3>用心服务</h3>
								<p>用心服务，一要 “真心”、“诚心”，即服务要从心灵沟通开始。只有用真心、用真诚去传情达意，才能使彼此的交流更为顺畅、更为高效、更为精彩。。</p>
							</div>
						</li>
						<li>
							<div class="slider-text">
								<h3>挖掘需求</h3>
								<p>潜在需求是指消费者虽然有明确意识的欲望，但由于种种原因还没有明确的显示出来的需求，一旦条件成熟，潜在需求就转化为显现需求，为企业提供无穷的商机。 </p>
							</div>
						</li>
						<li>
							<div class="slider-text">
								<h3>精准营销</h3>
								<p>深度洞察用户，挖掘用户潜在需求，是精准营销的根本。 </p>
							</div>
						</li>
						<li>
							<div class="slider-text">
								<h3>保持跟踪</h3>
								<p>电信本身就是一项旨在从事沟通千千万万人相互之间理解和信任的事业，需时刻与客户保持沟通</p>
							</div>
						</li>
					</ul>
					<div class="clear"> </div>
					<script src="js/responsiveslides.min.js"></script>
						 
				</div>
				<a href="submitorder.jsp" class="skip">我知道了</a>
			</div>
		
		<!--//mobile-slider-->
	</div>			
</body>
</html>