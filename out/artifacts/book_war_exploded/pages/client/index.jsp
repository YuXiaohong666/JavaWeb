<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>书城首页</title>
    <%--    静态包含，base标签，css样式，jquery--%>
    <%@include file="/pages/common/head.jsp" %>
</head>
<body>
<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">网上书城</span>
    <div>
        <c:if test="${empty sessionScope.user}">
            <%--            如果用户未登录显示登录和注册--%>
            <a href="pages/user/login.jsp">登录</a> |
            <a href="pages/user/regist.jsp">注册</a> &nbsp;&nbsp;
        </c:if>
        <c:if test="${not empty sessionScope.user}">
            <%--            如果用户已经登录则显示用户名--%>
            <span>欢迎<span class="um_span">${sessionScope.user.username}</span>光临尚硅谷书城</span>
            <a href="pages/order/order.jsp">我的订单</a>
            <a href="userServlet?action=logOut">注销</a>&nbsp;&nbsp;
        </c:if>
        <a href="pages/cart/cart.jsp">购物车</a>
        <a href="pages/manager/manager.jsp">后台管理</a>
    </div>
</div>
<div id="main">
    <div id="book">
        <div class="book_cond">
            <form action="client/bookServlet" method="get">
                <input type="hidden" name="action" value="pageByPrice">
                价格：<input id="min" type="text" name="min" value="${param.min}"> 元 -
                <input id="max" type="text" name="max" value="${param.max}"> 元
                <input type="submit" value="查询"/>
            </form>
        </div>
        <div style="text-align: center">
            <span>您的购物车中有3件商品</span>
            <div>
                您刚刚将<span style="color: red">时间简史</span>加入到了购物车中
            </div>
            <c:forEach items="${requestScope.page.items}" var="book">
                <div class="b_list">
                    <div class="img_div">
                        <img class="book_img" alt="" src="${book.imgPath}"/>
                    </div>
                    <div class="book_info">
                        <div class="book_name">
                            <span class="sp1">书名:</span>
                            <span class="sp2">${book.name}</span>
                        </div>
                        <div class="book_author">
                            <span class="sp1">作者:</span>
                            <span class="sp2">${book.author}</span>
                        </div>
                        <div class="book_price">
                            <span class="sp1">价格:</span>
                            <span class="sp2">￥ ${book.price}</span>
                        </div>
                        <div class="book_sales">
                            <span class="sp1">销量:</span>
                            <span class="sp2">${book.sales}</span>
                        </div>
                        <div class="book_amount">
                            <span class="sp1">库存:</span>
                            <span class="sp2">${book.stock}</span>
                        </div>
                        <div class="book_add">
                            <button>加入购物车</button>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div id="page_nav" style="clear: both">

            <c:if test="${requestScope.page.pageNo > 1}">
                <a href="client/bookServlet?action=page&pageNo=1">首页</a>
                <a href="client/bookServlet?action=page&pageNo=${requestScope.page.pageNo-1}">上一页</a>
                <a href="client/bookServlet?action=page&pageNo=${requestScope.page.pageNo-1}">${requestScope.page.pageNo-1}</a>
            </c:if>

            【${requestScope.page.pageNo}】

            <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
                <a href="client/bookServlet?action=page&pageNo=${requestScope.page.pageNo+1}">${requestScope.page.pageNo+1}</a>
                <a href="client/bookServlet?action=page&pageNo=${requestScope.page.pageNo+1}">下一页</a>
                <a href="client/bookServlet?action=page&pageNo=${requestScope.page.pageTotal}">末页</a>
            </c:if>
            共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录
            到第<input value="${requestScope.page.pageNo}" name="pn"
                       id="pn_input"/>页
            <input id="searchPageBtn" type="button" value="确定">
            <script>
                // 跳转到输入的指定页码
                $(function () {
                    $("#searchPageBtn").click(function () {
                        let pageNo = $("#pn_input").val();
                        location.href = "${pageScope.basePath}client/bookServlet?action=page&pageNo=" + pageNo;
                    })
                })
            </script>
        </div>
    </div>
</div>

<%@include file="/pages/common/foot.jsp" %>
</body>
</html>