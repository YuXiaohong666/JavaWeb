package com.geo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/4/3 11:06
 * @description
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求的参数
        String username = req.getParameter("username");
        System.out.println("在Servlet1中查看参数："+username);

//        给材料盖一个章，并传给Servlet2，使用域数据
        req.setAttribute("key","Servlet1的章");

//        问路，Servlet2怎么走
//        请求转发，必须要以斜杠开头
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");

//        走向Servlet2
        requestDispatcher.forward(req,resp);
    }
}
