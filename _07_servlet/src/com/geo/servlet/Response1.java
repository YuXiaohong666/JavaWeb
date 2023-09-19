package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/7/5 12:26
 * @description
 */
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("访问到了Response1");
//        设置响应状态码，表示重定向
//        resp.setStatus(302);
////        设置响应头，说明新的地址在哪里
//        resp.setHeader("Location", "http://localhost:8080/_07_servlet/response2");

        resp.sendRedirect("http://localhost:8080/_07_servlet/response2");
    }
}
