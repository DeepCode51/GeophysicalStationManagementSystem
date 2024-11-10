<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>/" />
<title>添加站台</title>
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/station/css/add.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/source/js/common.js" type="text/javascript"></script>
<script src="<%=basePath%>/view/station/js/add.js" type="text/javascript"></script>
<script type="text/javascript">
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header">
        <h2>添加站台</h2>
    </div>
    <div class="form-outer-box">
        <div class="form-box">
            <div class="row">
                <span class="lbl">站台编号：</span>
                <input name="stationNo" class="inp">
            </div>
            <div class="row">
                <span class="lbl">台站：</span>
                <input name="name" class="inp">
            </div>
            <div class="row">
                <span class="lbl">台站级别：</span>
                <input name="level" class="inp">
            </div>
            <div class="row">
                <span class="lbl">是否有人值守：</span>
                <input name="hasWatch" class="inp">
            </div>
            <div class="row">
                <span class="lbl">纬度：</span>
                <input name="lat" class="inp">
            </div>
            <div class="row">
                <span class="lbl">经度：</span>
                <input name="lng" class="inp">
            </div>
            <div class="row">
                <span class="lbl">高程(米)：</span>
                <input name="elevation" class="inp">
            </div>
            <div class="row">
                <span class="lbl">台站建成时间：</span>
                <input name="buildTime" class="inp">
            </div>
            <div class="row">
                <a href="javascript:;" id="submit" class="btn sub-btn">提交</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>