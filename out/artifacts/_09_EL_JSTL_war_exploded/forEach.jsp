<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/25
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="1" end="100" var="i">
    ${i}
</c:forEach>


<%
    request.setAttribute("arr", new String[]{"123", "456", "789"});
%>
<c:forEach items="${requestScope.arr}" var="i">
    ${i}
</c:forEach>

<%
    Map<String, Object> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");

    request.setAttribute("arr", map);
%>

<c:forEach items="${requestScope.arr}" var="entry">
    ${entry.key}=${entry.value}
</c:forEach>
</body>
</html>
