package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2023/4/3 9:37
 * @description
 */
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------doGet----------");
        //        获取请求的参数：
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        因为返回值是多个，所以要用数组接收
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("爱好："+ Arrays.asList(hobby));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("----------doPost----------");
        //        获取请求的参数：
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        因为返回值是多个，所以要用数组接收
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("用户名："+username);
        System.out.println("密码："+password);
        System.out.println("爱好："+ Arrays.asList(hobby));
    }
}
