<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.earth.station.model.Station" %>
<%@ page import="com.earth.station.common.SessionUtil" %>
<%@ page import="com.earth.station.model.StationUser" %>
<%@ page import="com.earth.station.common.constant.UserConstant.Level" %>
<%@ page import="com.earth.station.common.constant.SubjectConstant" %>
<%@taglib uri="/y" prefix="my" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
StationUser user = (StationUser)request.getSession().getAttribute(SessionUtil.user);
String name = (String) request.getAttribute("name");
name = name == null? "":name;
Integer subject = (Integer) request.getAttribute("subject");
subject = subject== null? 0: subject;
boolean isAdmin = Level.ADMIN.equals(user.getLevel());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>站台-地球物理台</title>
<base href="<%=basePath%>/" />
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/station/css/list.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/source/js/common.js" type="text/javascript"></script>
<script src="<%=basePath%>/view/station/js/list.js" type="text/javascript"></script>
<script type="text/javascript">
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header">
        <h2>站台列表</h2>
    </div>
    <div class="search-box">
        <form action="<%=basePath%>/station/list.html" method="post">
            <label>名称：</label>
	        <input name="name" value="<%=name%>">
            <label>学科：</label>
            <select name="subject" class="page_combox" data-value="<%=subject %>" data-url="<%=basePath%>/subject/findAll.html">

            </select>
	        <button type="submit" class="btn">查询</button>
            <% if (isAdmin) {%>
	        <a href="<%=basePath%>/station/addPage.html">添加站台</a>
            <%}%>
        </form>
    </div>
    <div class="table-box">
        <div class="table-head">
            <%--<span>序号</span>--%>
            <span>站台编码</span>
            <span>台站</span>
            <span>台站级别</span>
            <span>是否有人值守</span>
            <span>维度</span>
            <span>经度</span>
            <span>高程(米)</span>
            <span>建成时间</span>
            <span>测震</span>
            <span>强震</span>
            <span>地磁</span>
            <span>流体</span>
            <span>GNSS</span>
            <span>重力</span>
            <span>形变</span>
            <span>辅助</span>
            <% if(isAdmin) {%>
            <span>操作</span>
            <% } %>
        </div>
        <div class="table-body">
            <%
            List<Station> list = (List<Station>)request.getAttribute("list");
            for(int i=0; i< list.size(); i++){
            %>
            <div class="row">
                <%--<span><%=i + 1%></span>--%>
                <span><%=list.get(i).getStationNo()%></span>
                <span><%=list.get(i).getName()%></span>
                <span><%=list.get(i).getLevel()%></span>
                <span><%=list.get(i).getHasWatch()%></span>
                <span><%=list.get(i).getLat()%></span>
                <span><%=list.get(i).getLng()%></span>
                <span><%=list.get(i).getElevation()%></span>
                <span><%=list.get(i).getBuildTime()%></span>
                <span>
                    <%if (list.get(i).getTestEq() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.TEST_EQ%>">添加</a>
                        <% } else { %>
                                无
                        <% } %>
                    <% } else {%>
                    <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getTestEq()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getStrongEq() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.STRONG_EQ%>">添加</a>
                        <% } else { %>
                                无
                        <% } %>
                    <% } else {%>
                    <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getStrongEq()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getTm() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.TM%>">添加</a>
                        <% } else { %>
                            无
                        <% } %>
                    <% } else {%>
                    <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getTm()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getLiquid() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.LIQUID%>">添加</a>
                        <% } else { %>
                            无
                        <% } %>
                    <% } else {%>
                    <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getLiquid()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getGnss() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.GNSS%>">添加</a>
                        <% } else { %>
                            无
                        <% } %>
                    <% } else {%>
                    <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getGnss()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getGravity() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.GRAVITY%>">添加</a>
                        <% } else { %>
                            无
                        <% } %>
                    <% } else {%>
                    <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getGravity()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getDeformation() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.DEFORMATION%>">添加</a>
                         <% } else { %>
                            无
                        <% } %>
                    <% } else {%>
                        <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getDeformation()%>">详情</a>
                    <% } %>
                </span>
                <span>
                    <%if (list.get(i).getAid() == 0){%>
                        <% if(isAdmin) {%>
                            <a href="<%=basePath%>/subject/addPage.html?stationId=<%=list.get(i).getId()%>&type=<%=SubjectConstant.AID%>">添加</a>
                        <% } else { %>
                            无
                        <%}%>
                    <% } else {%>
                        <a href="<%=basePath%>/subject/list.html?id=<%=list.get(i).getAid()%>">详情</a>
                    <% } %>
                </span>
                <% if(isAdmin) { %>
                <span>
                    <a href="<%=basePath%>/station/updatePage.html?id=<%=list.get(i).getId() %>">编辑</a>
                    <a href="javascript:;" class="delete-btn" data-id="<%=list.get(0).getId() %>">删除</a>
                </span>
                <% } %>
            </div>
            <%}%>
        </div>
    </div>
</div>

</body>
</html>