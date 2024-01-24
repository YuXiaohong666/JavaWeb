<%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/24
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.getScheme();  //获取请求的协议
    request.getServerName();  //获取请求的服务器ip或域名
    request.getServerPort();  //获取请求的服务器端口号
    request.getContextPath();  //获取当前的工程路径
    request.getMethod();  //获取请求的方式
    request.getRemoteHost();  //获取客户端的ip
    session.getId();  //获取会话的id编号
%>
1. 协议：${pageContext.request.scheme}<br>
2. 服务器ip：${pageContext.request.serverName}<br>
3. 服务器端口：${pageContext.request.serverPort}<br>
4. 获取工程路径：${pageContext.request.contextPath}<br>
5. 获取请求方法：${pageContext.request.method}<br>
6. 获取客户端ip地址：${pageContext.request.remoteHost}<br>
7. 获取会话的id编号：${pageContext.session.id}
</body>
</html>
