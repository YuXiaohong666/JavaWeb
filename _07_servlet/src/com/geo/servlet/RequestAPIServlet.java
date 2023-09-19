package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/4/3 9:01
 * @description
 */
public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getRequestURI()：获取请求的资源路径
        System.out.println("URI => "+req.getRequestURI());
//        getRequestURL()：获取请求的统一资源定位符(绝对路径)
        System.out.println("URL => "+req.getRequestURL());
//        getRemoteHost()：获取客户端的ip地址
        System.out.println("客户端的ip地址："+req.getRemoteHost());
//        getHeader()：获取请求头
        System.out.println("请求头User-Agent："+req.getHeader("User-Agent"));
//        getMethod()：获取请求的方式GET或POST
        System.out.println("获取请求的方式："+req.getMethod());
    }
}
