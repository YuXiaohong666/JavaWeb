<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/25
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/_09_EL_JSTL/uploadServlet" method="post" enctype="multipart/form-data">
    <label>
        用户名：
        <input type="text" name="username">
    </label><br>
    头像：<input type="file" name="photo"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
