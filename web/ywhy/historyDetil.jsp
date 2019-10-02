<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.YWHY.bean.Order" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/"+path + "/";
%>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>工单详情</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link rel="stylesheet" href="<%=basePath%>css/sm.css">
    <link rel="stylesheet" href="<%=basePath%>css/sm-extend.css">
    <link rel="stylesheet" href="<%=basePath%>css/demos.css">
    <script type="text/javascript">
      function colseWindow() {
          console.log("!!!!!!");
          window.close();
      }
    </script>
  </head>
  <body>
    <div class="page-group" class="remodal" data-remodal-id="modal">
        <div class="page page-current">
<header class="bar bar-nav">
  <h1 class='title'>工单详情</h1>
</header>
<div class="content">
  <div class="list-block">
    <ul>
      <!-- Text inputs -->
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">发单人：</div>
            <div class="item-input">
              <input type="text" placeholder="（空）" disabled="disabled" value="${orderDetil.userName}">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">用户姓名：</div>
            <div class="item-input">
              <input type="text" placeholder="（空）" disabled="disabled" value="${orderDetil.orderUserName}">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-email"></i></div>
          <div class="item-inner">
            <div class="item-title label">联系电话：</div>
            <div class="item-input">
              <input type="text" placeholder="（空）" disabled="disabled" value="${orderDetil.orderTele}">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-password"></i></div>
          <div class="item-inner">
            <div class="item-title label">需求描述：</div>
            <div class="item-input">
              <textarea  name="orderText" placeholder="（空）" disabled="disabled" >${orderDetil.orderText}</textarea>
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-gender"></i></div>
          <div class="item-inner">
            <div class="item-title label">区域归属：</div>
            <div class="item-input">
              <select>
                <option>${orderDetil.orderArea}</option>
              </select>
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-gender"></i></div>
          <div class="item-inner">
            <div class="item-title label">支撑经理：</div>
            <div class="item-input">
              <select>
                <option>${orderDetil.supportName}</option>
              </select>
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-password"></i></div>
          <div class="item-inner">
            <div class="item-title label">发单时间：</div>
            <div class="item-input">
              <input  type="text" placeholder="（空）" disabled="disabled" value="${usedTime.orderStartDate}">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-password"></i></div>
          <div class="item-inner">
            <div class="item-title label">回单时间：</div>
            <div class="item-input">
              <input  type="text" placeholder="（空）" disabled="disabled" value="${usedTime.orderEndDate}">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-password"></i></div>
          <div class="item-inner">
            <div class="item-title label">处理时长：</div>
            <div class="item-input">
              <input type="text" placeholder="（空）" disabled="disabled" value="${usedTime.usedTime}">
            </div>
          </div>
        </div>
      </li>
      <c:if test="${orderDetil.orderStatus==1}">
        <li>
          <div class="item-content">
            <div class="item-media"><i class="icon icon-form-email"></i></div>
            <div class="item-inner">
              <div class="item-title label">工单状态：</div>
              <div class="item-input">
                  <span style="color:#228b22">成功</span>
              </div>
            </div>
          </div>
        </li>
        <li>
          <div class="item-content">
            <div class="item-media"><i class="icon icon-form-email"></i></div>
            <div class="item-inner">
              <div class="item-title label">受理套餐：</div>
              <div class="item-input">
                <span>${prods.prodTypeName}</span>
              </div>
            </div>
          </div>
        </li>
        <li>
          <div class="item-content">
            <div class="item-media"><i class="icon icon-form-email"></i></div>
            <div class="item-inner">
              <div class="item-title label">接入号：</div>
              <div class="item-input">
                <span>${prods.prodAccount}</span>
              </div>
            </div>
          </div>
        </li>
      </c:if>
      <c:if test="${orderDetil.orderStatus==2}">
        <li>
          <div class="item-content">
            <div class="item-media"><i class="icon icon-form-email"></i></div>
            <div class="item-inner">
              <div class="item-title label">工单状态：</div>
              <div class="item-input">
                <span style="color:#a52a2a">失败</span>
              </div>
            </div>
          </div>
        </li>
        <li>
          <div class="item-content">
            <div class="item-media"><i class="icon icon-form-email"></i></div>
            <div class="item-inner">
              <div class="item-title label">失败原因：</div>
              <div class="item-input">
                <textarea  name="orderText" placeholder="（空）" disabled="disabled" >${orderDetil.orderDefeat}</textarea>
              </div>
            </div>
          </div>
        </li>
      </c:if>
    </ul>
  </div>
  <div class="content-block">
    <div class="row">
      <div class="col-100"><a href="javascript:window.opener=null;window.open('','_self');window.close();" class="button button-big button-fill button-danger">关闭页面</a></div>
    </div>
  </div>
</div>
        </div>
    </div>
    <script src="<%=basePath%>js/historyJS/zepto.js"></script>
    <script src="<%=basePath%>js/historyJS/config.js"></script>
    <script src="<%=basePath%>js/historyJS/sm.js"></script>
    <script src="<%=basePath%>js/historyJS/sm-extend.js"></script>
    <script src="<%=basePath%>js/historyJS/sm-city-picker.js"></script>
    <script src="<%=basePath%>js/historyJS/demos.js"></script>

  </body>
</html>