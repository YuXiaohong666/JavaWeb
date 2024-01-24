<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/24
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
使用表达式脚本设置数据：
<%
    request.setAttribute("key", "value");
%><br>
使用表达式脚本读取数据：
<%=request.getAttribute("key")%><br>

使用EL表达式读取数据：${key}
</body>
</html>
