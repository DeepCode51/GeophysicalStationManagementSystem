<%@ page import="com.earth.station.common.constant.SubjectConstant" %>
<%@ page import="static com.earth.station.common.constant.SubjectConstant.STRONG_EQ" %>
<%@ page import="static com.earth.station.common.constant.SubjectConstant.SUBJECT_MAPPING" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
Integer stationId = (Integer) request.getAttribute("stationId");
Integer type = (Integer) request.getAttribute("type");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>/" />
<title></title>
<link href="<%=basePath%>/source/css/common.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>/view/subject/css/add.css" rel="stylesheet" type="text/css"/>
<script src="<%=basePath%>/source/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<link href="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.css" rel="stylesheet" >
<script src="<%=basePath%>/source/sweetalert2/dist/sweetalert2.min.js"></script>
<script src="<%=basePath%>/source/js/common.js" type="text/javascript"></script>
<script src="<%=basePath%>/view/subject/js/add.js" type="text/javascript"></script>
<script type="text/javascript">
function getBasePath(){
    return '<%=basePath%>';
 }
</script>
</head>
<body>
<div class="body-box">
    <div class="header">
        <h2>添加学科(<%=SUBJECT_MAPPING.get(type)%>)</h2>
    </div>
    <div class="form-outer-box">
        <div class="form-box">
            <input type="hidden" name="stationId" value="<%=stationId%>" />
            <input type="hidden" name="type" value="<%=type%>" />
            <% if (SubjectConstant.TEST_EQ.equals(type)) { %>
                <div class="row">
                    <span class="lbl">地震计型号：</span>
                    <input name="地震计型号" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">数采型号：</span>
                    <input name="数采型号" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">场地类型：</span>
                    <input name="场地类型" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">仪器序列号：</span>
                    <input name="仪器序列号" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">仪器生产厂家：</span>
                    <input name="仪器生产厂家" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">IP地址：</span>
                    <input name="IP地址" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">传输方式：</span>
                    <input name="传输方式" class="inp">
                </div>
                <div class="row">
                    <span class="lbl">运行日期：</span>
                    <input name="运行日期" class="inp">
                </div>
            <% } else if (STRONG_EQ.equals(type)) { %>
            <div class="row">
                <span class="lbl">加速度计型号：</span>
                <input name="地震计型号" class="inp">
            </div>
            <div class="row">
                <span class="lbl">数采型号：</span>
                <input name="数采型号" class="inp">
            </div>
            <div class="row">
                <span class="lbl">场地类型：</span>
                <input name="场地类型" class="inp">
            </div>
            <div class="row">
                <span class="lbl">仪器序列号：</span>
                <input name="仪器序列号" class="inp">
            </div>
            <div class="row">
                <span class="lbl">仪器生产厂家：</span>
                <input name="仪器生产厂家" class="inp">
            </div>
            <div class="row">
                <span class="lbl">IP地址：</span>
                <input name="IP地址" class="inp">
            </div>
            <div class="row">
                <span class="lbl">传输方式：</span>
                <input name="传输方式" class="inp">
            </div>
            <div class="row">
                <span class="lbl">运行日期：</span>
                <input name="运行日期" class="inp">
            </div>
            <% } else {%>
            <div class="row">
                <span class="lbl">测点编码：</span>
                <input name="测点编码" class="inp">
            </div>
            <div class="row">
                <span class="lbl">仪器名称：</span>
                <input name="仪器名称" class="inp">
            </div>
            <div class="row">
                <span class="lbl">仪器型号：</span>
                <input name="仪器型号" class="inp">
            </div>
            <div class="row">
                <span class="lbl">仪器ID：</span>
                <input name="仪器ID" class="inp">
            </div>
            <div class="row">
                <span class="lbl">采样率：</span>
                <input name="采样率" class="inp">
            </div>
            <div class="row">
                <span class="lbl">观测时间：</span>
                <input name="观测时间" class="inp">
            </div>
            <div class="row">
                <span class="lbl">运行状态：</span>
                <input name="运行状态" class="inp">
            </div>
            <% } %>
            <div class="row">
                <span class="lbl">备注：</span>
                <input name="备注" class="inp">
            </div>
            <div class="row">
                <a href="javascript:;" class="btn sub-btn">提交</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>