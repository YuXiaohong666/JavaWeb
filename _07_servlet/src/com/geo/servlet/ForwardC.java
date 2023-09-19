package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/7/3 17:14
 * @description
 */
public class ForwardC extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("经过了ForwardC程序！");
        req.getRequestDispatcher("/a/b/c/d.html").forward(req,resp);
    }
}
