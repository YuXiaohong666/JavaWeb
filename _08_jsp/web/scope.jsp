<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/24
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //往四个域中都保存了数据
    pageContext.setAttribute("key", "pageContext");
    request.setAttribute("key", "request");
    session.setAttribute("key", "session");
    application.setAttribute("key", "application");
%>

pageContext是否有值：<%=pageContext.getAttribute("key")%>
request是否有值：<%=request.getAttribute("key")%>
session是否有值：<%=session.getAttribute("key")%>
application是否有值：<%=application.getAttribute("key")%>
</body>
</html>
