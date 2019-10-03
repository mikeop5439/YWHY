<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<link rel="stylesheet" href="src/jquery.remodal.css">
	<!--结果选择-->
	<div class="remodal" data-remodal-id="modal">
		<h1 style="color:#1C2637 ">营销结果反馈</h1>
		<p>
			感谢营销支撑的辛苦付出，无论营销是否成功都感谢您的付出！
		</p>
		<p>
			请在下方选择您的营销结果
		</p>
		<br>
		<a class="remodal1-cancel1" href="#modal2">失败</a>
		<a class="remodal1-confirm1" onclick="setProdsType()" href="#modal3">成功</a>
	</div>

	<!--失败原因反馈-->
	<div class="remodal" data-remodal-id="modal2">
		<h1 style="color:#1C2637 ">失败原因</h1>
		<p>
			<!--
                        Flat, responsive, lightweight, fast, easy customizable modal window plugin
                        with declarative state notation and hash tracking.
            -->
			<textarea id="defeatres"class="textarea11" placeholder="如产品是否不满足客户需求、价格因素等"></textarea>
		</p>
		<p>
			感谢您提供的宝贵经验<input  type="hidden" id="orderid_rp_def"/>
		</p>
		<br>
		<a class="remodal-cancel" href="#">取消</a>
		<a id="submitdef" class="remodal-confirm" onclick="submitOrderRpOfDef()"  >提交</a>
	</div>

	<!--成功信息提交-->
	<div class="remodal" data-remodal-id="modal3">
		<h1 style="color:#1C2637 ">回复工单</h1>
		<p>
			<!--
                        Flat, responsive, lightweight, fast, easy customizable modal window plugin
                        with declarative state notation and hash tracking.
            -->
			请填写受理的业务及接入号<input type="hidden" id="orderid_rp_suc"/>
		</p>
		<br>
		<p>
			业务名称：
			<select id="prodstype" name="themplate" >
		    </select>
		</p>
		<br>
		<p>
			&nbsp&nbsp&nbsp接入号： <input id="prodAccount" type="text" />
		</p>
		<br>
		<a class="remodal-cancel" href="#">Cancel</a>
		<a id="submitsucc" class="remodal-confirm" onclick="submitSuccessOrder()" >OK</a>
	</div>
	</div>
<!--js-->
<script src="js/jquery-1.11.1.min.js"></script>
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
            queryOrderCount(user_id);
            queryOrders(user_id);
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
									<li><a href="onwayorder.jsp"><span class="icons icn1"> </span>在途工单</a></li>
									<li><a href="historyorder.jsp"><span class="icons icn3"> </span> 历史工单</a></li>
									<li><a href="#"><span class="icons icn4"> </span> 设置</a></li>
									<li><a onclick="logOut()"  href="#"><span class="icons icn5"> </span> 退出</a></li>
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
				<div id="gzdiv"class="work-text">
					<h3 id="gz">正在跟踪</h3>
					<section id="information-area" class="ac-container">
					</section>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript" src="js/settime.js"></script>
<script src="src/jquery.remodal.js"></script>
<script type="text/javascript">
    function setProdsType() {
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath }/prod/queryAllProds.action",
            dataType:"json",
            success:function(data){
                $("#prodstype").empty();
                $.each(data,function(index,content){
                    var option = $("<option></option>").attr("value",content.prodTypeId).append(content.prodTypeName);
                    $("#prodstype").append(option);
                });
            }
        });
    }
	function setOrderId(orderid) {
        $("#orderid_rp_suc").val(orderid);
        $("#orderid_rp_def").val(orderid);
    }
    function queryOrderCount(user_id){
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath }/order/queryCount.action",
            data:"user_id="+user_id,
            dataType:"json",
            success:function(data){
                $("#order_all_count").empty();
                $("#order_all_count").append(data.order_all_count);
                $("#order_end_count").empty();
                $("#order_end_count").append(data.order_ent_count);
            }
        });
	}
    function queryOrders(user_id){
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath }/order/queryOrder.action",
            data:"user_id="+user_id,
            dataType:"json",
            success:function(data){
                console.log(data.length);
                if (data.length==0){
                    $("#gzdiv").empty();
                    var div1=$("<div></div>").attr("align","center").attr("href","#modal");
                    var h3=$("<h3></h3>")
                    $("#gzdiv").append(div1).append(h3.append("没有正在跟踪的商机！"));
				}else{
                    $("#information-area").empty();
                    $.each(data,function(index,content){
                        var date=SetTime(content.orderStartDate);
                        var text_centent=content.orderText;
                        var titel_centent=content.orderUserName+","+date+"  (发单人："+content.userName+")";
                        var index1=index%4+1;
                        var text1="ac-"+index1;
                        var text2="grid"+index1;
                        var div1=$("<div></div>");
                        var input=$("<input />").attr("id",text1).attr("name","accordion-1").attr("type","checkbox");
                        var i=$("<i />").attr("id","kkk");
                        var label=$("<label></label>").attr("for",text1).addClass(text2).append(i).append(titel_centent);
                        var article=$("<article></article>").addClass("ac-small");
                        var p=$("<p></p>").append(text_centent);
                        var a=$("<a></a>").attr("href","#modal").attr("onClick","setOrderId("+content.orderId+")");
                        var font=$("<font></font>").attr("color","#FFFFFF").attr("size","4").append("点击回单");
                        var div2=$("<div></div>").css({"background-color":"#E259C6"}).attr("align","center").attr("href","#modal");
                        var information=div1.append(input).append(label).append(article.append(p).append(div2.append(a.append(font))));
                        $("#information-area").append(information);
                    });
				}
            }
        });
	}
    function submitOrderRpOfDef(){
        if(checkDefInput()){
            $("#submitdef").attr("href","#");
            var user_id="${ sessionScope.userid}";
            var orderId = $("#orderid_rp_def").val();
            var orderDefeat = $("#defeatres").val();
            var params = '{"orderId":"'+orderId+'","orderDefeat":"'+orderDefeat+'"}';
            $.ajax({
                headers : {"ClientCallMode" : "ajax"},
                type:"POST",
                contentType: 'application/json',
                url:"${pageContext.request.contextPath }/order/submitOrderOfDef.action",
                data:params,
                dataType:"json",
                success:function(data){
                    if(data==1){
                        queryOrders(user_id);
                    }
                }
            });
        }else{
            return false;
        }
	}
    function submitOrderOfSuccess() {
        var orderSupportId="${ sessionScope.userid}";
        var orderId = $("#orderid_rp_def").val();
        var params = '{"orderSupportId":"'+orderSupportId+'","orderId":"'+orderId+'"}';
        $.ajax({
            headers : {"ClientCallMode" : "ajax"},
            type:"POST",
            contentType: 'application/json',
            url:"${pageContext.request.contextPath }/order/submitOrderOfSuccess.action",
            data:params,
            dataType:"json",
            success:function(data){
            }
        });
    }
    function submitProds() {
        var prodTypeId = $("#prodstype").val();
        var prodAccount = $("#prodAccount").val();
        var orderId = $("#orderid_rp_def").val();
        var params = '{"prodTypeId":"'+prodTypeId+'","prodAccount":"'+prodAccount+'","orderId":"'+orderId+'"}';
        $.ajax({
            headers : {"ClientCallMode" : "ajax"},
            type:"POST",
            contentType: 'application/json',
            url:"${pageContext.request.contextPath }/order/submitProds.action",
            data:params,
            dataType:"json",
            success:function(data){
            }
        });

    }
    function submitSuccessOrder(){
        if(checkSuccessInput()){
            $("#submitsucc").attr("href","#");
            var user_id="${ sessionScope.userid}";
            submitProds();
            submitOrderOfSuccess();
            queryOrderCount(user_id);
            queryOrders(user_id);
        }else{
            return false;
        }
	}
    function checkDefInput(){
        var flag = true;
        //判断用户名
        if($("#defeatres").val()==null || $("#defeatres").val()==""){
            alert("原因不能空，请按照实际情况填写。");
            $("#defeatres").focus();
            flag =false;
            return flag;
        }
        return flag;
    }

    function checkSuccessInput(){
        var flag = true;
        //判断用户名
        if($("#prodAccount").val()==null || $("#prodAccount").val()==""){
            alert("接入号不能空！。");
            $("#prodAccount").focus();
            flag =false;
            return flag;
        }
        return flag;
    }
    function logOut(){
        $.ajax({
            headers : {"ClientCallMode" : "ajax"},
            type:"POST",
            url:"${pageContext.request.contextPath }/user/logout.action",
            success:function(data){
                window.location.href="${pageContext.request.contextPath }/ywhy/login.jsp";
            }
        });
    }
</script>
</html>