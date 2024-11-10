<%@ page import="com.earth.station.model.Subject" %>
<%@ page import="com.alibaba.fastjson.JSON" %>
<%@ page import="com.alibaba.fastjson.JSONArray" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
Subject entity = (Subject)request.getAttribute("subject");
JSONArray content = JSON.parseArray(entity.getContent());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>/" />
<title></title>
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/subject/css/update.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/source/js/common.js" type="text/javascript"></script>
<script src="<%=basePath%>/view/subject/js/update.js" type="text/javascript"></script>
<script type="text/javascript">
    var dataId = <%=entity.getId()%>
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header">
        <h2>修改学科</h2>
    </div>
    <div class="form-outer-box">
        <div class="form-box">
            <% for (int i=0; i< content.size(); i++) {%>
            <div class="row">
                <span class="lbl"><%=content.getJSONArray(i).getString(0)%>：</span>
                <input name="<%=content.getJSONArray(i).getString(0)%>" class="inp" value="<%=content.getJSONArray(i).getString(1) %>">
            </div>
            <%}%>
            <input name="id" type="hidden" value="<%=entity.getId() %>">
            <div class="row">
                <a href="javascript:;" class="btn sub-btn">提交</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>