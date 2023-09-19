package com.example._06servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.example._06servlet
 * @date 2023/3/27 20:20
 * @description
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("1.构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化");

//        1.可以获取Servlet程序的别名 servlet-name 的值
        System.out.println("servlet的别名是"+servletConfig.getServletName());
//        2.获取初始化参数init-param
        System.out.println("初始化参数username的值是"+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是"+servletConfig.getInitParameter("url"));
//        3.获取servletContext对象
        System.out.println("获取servletContext对象是"+servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * service方法是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     * */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        执行你的功能代码
        System.out.println("3.service === Hello Servlet 被访问了");
//类型转换（因为它有getMethod()方法）
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//获取请求方式
        String method= httpServletRequest.getMethod();

        if("GET".equals(method)){
            doGet();
        }else if("POST".equals(method)){
            doPost();
        }
    }

//    做get请求的操作
    public void doGet(){
        System.out.println("get请求");
    }

//    做post请求的方法
    public void doPost(){
        System.out.println("post请求");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destroy销毁方法");
    }
}
