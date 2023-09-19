package com.example._06servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.example._06servlet
 * @date 2023/3/27 22:42
 * @description
 */
public class HelloServlet2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("重写了init初始化方法，做了一些工作");

    }

    /**
     * doGet()在get请求的时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doGet方法");

//        先打出getServletConfig()，然后按下alt+回车创建变量
        ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig);

        System.out.println("初始化username的值是："+servletConfig.getInitParameter("username2"));
        System.out.println("初始化url的值是："+servletConfig.getInitParameter("url"));
    }
    /**
     * doPost()在post请求的时候调用
     * @param resp
     * @param req
     * @throws ServletException
     * @throws IOException
     * */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doPost方法");
    }
}
