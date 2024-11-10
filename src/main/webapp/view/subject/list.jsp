<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.earth.station.model.Station" %>
<%@ page import="com.earth.station.model.Subject" %>
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%@ page import="com.alibaba.fastjson.JSON" %>
<%@ page import="static com.earth.station.common.constant.SubjectConstant.SUBJECT_MAPPING" %>
<%@ page import="com.alibaba.fastjson.JSONArray" %>
<%@ page import="com.earth.station.common.SessionUtil" %>
<%@ page import="com.earth.station.common.constant.UserConstant.Level" %>
<%@ page import="com.earth.station.model.StationUser" %>
<%@taglib uri="/y" prefix="my" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
Station station = (Station) request.getAttribute("station");
Subject subject = (Subject) request.getAttribute("subject");
JSONArray array = JSON.parseArray(subject.getContent());
boolean isAdmin = Level.ADMIN.equals(((StationUser)request.getSession().getAttribute(SessionUtil.user)).getLevel());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学科-地球物理台</title>
<base href="<%=basePath%>/" />
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/station/css/list.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/source/js/common.js" type="text/javascript"></script>
<script src="<%=basePath%>/view/subject/js/list.js" type="text/javascript"></script>
<script type="text/javascript">
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header">
        <h2><%=station.getStationNo()%>-<%=station.getName()%>-<%=SUBJECT_MAPPING.get(subject.getType())%></h2>
    </div>
    <div class="table-box">
        <div class="table-head">
            <span>台站编码</span>
            <span>台站名称</span>
            <% for (int i = 0; i < array.size(); i++){ %>
                <span><%=array.getJSONArray(i).getString(0)%></span>
            <%}%>
            <% if (isAdmin) {%>
            <span>操作</span>
            <% } %>
        </div>
        <div class="table-body">
            <div class="row">
                <span><%=station.getStationNo()%></span>
                <span><%=station.getName()%></span>
                <% for (int i=0; i< array.size(); i++){ %>
                <span><%=array.getJSONArray(i).getString(1)%></span>
                <%}%>
                <% if (isAdmin) {%>
                <span>
                    <a href="<%=basePath%>/subject/updatePage.html?id=<%=subject.getId() %>">编辑</a>
                    <a href="javascript:;" class="delete-btn" data-id="<%=subject.getId() %>">删除</a>
                </span>
                <% } %>
            </div>
        </div>
    </div>
</div>

</body>
</html>