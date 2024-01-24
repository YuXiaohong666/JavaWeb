<%@ page import="com.geo.pojo.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 13511
  Date: 2024/1/24
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName(12);
    person.setPhones(new String[]{"123456", "7777777"});
    List<String> list = new ArrayList();
    list.add("北京");
    list.add("上海");
    list.add("张家口");
    person.setCities(list);

    Map<String, Object> map = new HashMap();
    map.put("哈哈", 123);
    map.put("lolo", 555);
    person.setMap(map);

    pageContext.setAttribute("Person", person);
%>

${Person}<br>
</body>
</html>
