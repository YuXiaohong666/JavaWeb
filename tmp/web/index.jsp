<%--
  Created by IntelliJ IDEA.
  User: YuHong
  Date: 2024/5/21
  Time: 下午6:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="testservlet">
    用户名：<input type="text"><br>
    密码：<input type="text"><br>
    验证码：<input type="text" name="code"><img src="http://localhost:8080/tmp/kaptcha">
    <input type="submit">提交
</form>
</body>
</html>
