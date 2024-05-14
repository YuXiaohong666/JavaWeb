package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YuHong
 * #Description LoginServlet
 * #Date: 2024/5/14 17:43
 */
@WebServlet(name = "LoginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("admin") && password.equals("admin")) {
//            登录成功
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(7 * 60 * 60);  //当前cookie一周内有效
            Cookie cookie1 = new Cookie("password", password);
            cookie1.setMaxAge(7 * 60 * 60);  //当前cookie一周内有效
            resp.addCookie(cookie);
            resp.addCookie(cookie1);
            System.out.println("登录成功");
        } else {
//            登录失败
            System.out.println("登录失败");

        }
    }
}
