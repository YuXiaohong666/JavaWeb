package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/4/3 11:08
 * @description
 */
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在Servlet2中查看参数："+username);

        Object key = req.getAttribute("key");
        System.out.println("Servlet1是否有章："+key);
//        处理自己的业务：
        System.out.println("servlet2处理自己的业务");
    }
}
