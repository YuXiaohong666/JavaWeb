<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/24
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
头部信息 <br>
主体内容 <br>
<%--静态包含--%>
<%@include file="footer.jsp" %>

<%--动态包含--%>
<jsp:include page="footer.jsp">
    <jsp:param name="password" value="root"/>
</jsp:include>

<%--请求转发--%>
<jsp:forward page="footer.jsp"></jsp:forward>
</body>
</html>
