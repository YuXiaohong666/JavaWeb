package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/7/3 18:42
 * @description
 */
public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        // 设置服务器回传的数据编码集
//        resp.setCharacterEncoding("UTF-8");
//        // 通过响应头，设置浏览器也使用UTF-8字符集
//        resp.setHeader("Content-Type", "text/html;charset=UTF-8");

//        这一行代码同时设置好了服务器的编码以及响应头的编码，此方法一定要在获取流对象之前调用才有效
        resp.setContentType("text/html;charset=UTF-8");
        writer.write("之一's content!");
    }
}
