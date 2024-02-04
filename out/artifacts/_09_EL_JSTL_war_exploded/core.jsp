<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/24
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
保存之前：${requestScope.abc}<br>
<c:set scope="request" var="abc" value="123"></c:set>
保存之后：${requestScope.abc}<br>


<c:if test="${12==12}">
    <h1>if语句判断成功了！</h1>
</c:if>

<%
    request.setAttribute("height", 128);
%>
<c:choose>
    <c:when test="${height>190}">
        <h2>高个子</h2>
    </c:when>
    <c:when test="${height>170}">
        <h2>正常</h2>
    </c:when>
    <c:when test="${height>130}">
        <h2>很低</h2>
    </c:when>
    <c:otherwise>
        <h2>身高低于130</h2>
    </c:otherwise>
</c:choose>
</body>
</html>
