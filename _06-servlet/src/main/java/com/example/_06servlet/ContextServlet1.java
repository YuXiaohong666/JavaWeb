package com.example._06servlet; /**
 * @author yuxiaohong
 * @package ${PACKAGE_NAME}
 * @date 2023/3/28 15:42
 * @description ${DESCRIPTION}
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取servletContext对象
        ServletContext context = getServletContext();

        context.setAttribute("key1","value1");
        System.out.println("context1中获取域数据key1的的值是："+context.getAttribute("key1"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
