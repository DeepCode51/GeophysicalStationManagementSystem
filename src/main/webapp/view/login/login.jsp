<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>登录-地球物理台</title>
  <link rel="stylesheet" href="<%=basePath %>/view/login/css/login.css">
  <script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
  <script src="<%=basePath%>/source/js/jquery.cookie.js" type="text/javascript"></script>
  <script src="<%=basePath %>/view/login/js/login.js"></script>
  <script>
	function getBasePath(){
	    return '<%=basePath%>';
    }
  </script>
</head>
<body>
    <div class="form-box">
        <div class="header">
            <p>登录-地球物理台</p>
        </div>
        <div class="form-item">
            <input type="text" name="userName" placeholder="登录账号" class="inp">
        </div>
        <div class="form-item">
            <input type="password" name="password" placeholder="登录密码" class="inp" value="">
        </div>
        <div class="form-item">
            <button class="btn sub-btn">登 入</button>
        </div>
    </div>
</body>
</html>
