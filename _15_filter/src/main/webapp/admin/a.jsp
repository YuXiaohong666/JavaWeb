<%--
  Created by IntelliJ IDEA.
  User: YuHong
  Date: 2024/5/23
  Time: 下午6:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object user = session.getAttribute("user");
    if (user == null) {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
%>
我是a.jsp文件
</body>
</html>
