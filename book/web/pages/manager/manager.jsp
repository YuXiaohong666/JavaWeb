<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <%--    静态包含，base标签，css样式，jquery--%>
    <%@include file="/pages/common/head.jsp" %>
    <style type="text/css">
        h1 {
            text-align: center;
            margin-top: 200px;
        }
    </style>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="../../static/img/logo.gif">
    <span class="wel_word">后台管理系统</span>
    <%--    静态包含manager--%>
    <%@include file="/pages/common/manager_menu.jsp" %>
</div>

<div id="main">
    <h1>欢迎管理员进入后台管理系统</h1>
</div>

<%@include file="/pages/common/foot.jsp" %>
</body>
</html>