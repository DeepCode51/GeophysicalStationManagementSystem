<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.earth.station.model.StationUser" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<%
StationUser user = (StationUser)request.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>地球物理台网</title>
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/index/css/index.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/view/index/js/index.js" type="text/javascript"></script>
<script type="text/javascript">
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header-box">
        <span class="logo" target="_blank">地球物理台</span>
        <div class="links">
            <a href="javascript:;" class="topNaviLink"><span><%=user.getUserName() %></span><i class="triangle_down"></i></a>
        </div>
        <div class="userCenter-outer">
	        <div class="userCenter">
	            <div class="foot">
	                <a href="javascript:;" class="btn_logout" id="logout">退出</a>
                    <a href="javascript:;" class="btn_logout" id="update_passwd">修改密码</a>
                </div>
            </div>
        </div>
        
    </div>
    <div class="main-box">
        <div class="content">
            <iframe name="content" src="<%=basePath%>/station/list.html" frameborder="0" scrolling="auto"></iframe>
        </div>
    </div>
</div>
</body>
</html>