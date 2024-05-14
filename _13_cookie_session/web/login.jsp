<%--
  Created by IntelliJ IDEA.
  User: YuHong
  Date: 2024/5/14
  Time: 下午5:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/cs/loginServlet" method="get">
    用户名：<input type="text" name="username" value="${cookie.username.value}"><br>
    密码：<input type="password" name="password" value="${cookie.password.value}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
