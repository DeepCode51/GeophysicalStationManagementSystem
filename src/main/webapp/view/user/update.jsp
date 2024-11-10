<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.earth.station.model.StationUser" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<%
StationUser user = (StationUser)request.getAttribute("entity");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>/" />
<title></title>
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/user/css/update.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/source/js/common.js" type="text/javascript"></script>
<script src="<%=basePath%>/view/user/js/update.js" type="text/javascript"></script>
<script type="text/javascript">
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header">
        <h2>修改密码</h2>
    </div>
    <div class="form-outer-box">
        <div class="form-box">
            <div class="row">
                <span class="lbl">账号：</span>
                <span><%=user.getUserName() %></span>
            </div>
            <div class="row">
                <span class="lbl">密码：</span>
                <input name="password" type="password" class="inp" value="<%=user.getPassword() %>">
            </div>
            <div class="row">
                <input name="id" type="hidden" value="<%=user.getId() %>">
                <a href="javascript:;" class="btn sub-btn">提交</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>