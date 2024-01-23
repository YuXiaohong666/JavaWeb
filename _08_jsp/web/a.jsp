<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/23
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是html页面数据
<%--1.声明类属性--%>
<%!
    private Integer id;
    private String name;
    private static Map<String, Object> map;
%>
<%--2.声明静态代码块--%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
    }
%>
<%--3.声明类方法--%>
<%!
    public int abc() {
        return 12;
    }
%>
<%--4.声明内部类--%>
<%!
    public static class A {
        private Integer id = 12;
        private String abc = "ab";
    }
%>

<%--输出整型--%>
<%=12%> <br/>
<%--输出浮点型--%>
<%=12.12%> <br/>
<%--输出字符串--%>
<%="我是字符串"%> <br/>
<%--输出对象--%>
<%=map%> <br/>

</body>
</html>
