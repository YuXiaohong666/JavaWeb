package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.jshell.spi.ExecutionControl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.servlet
 * @date 2024/1/25 10:52
 * @description 处理文件上传
 */
public class uploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("文件上传过来了" + req.getInputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("文件上传过来了" + req.getParameter("username"));
    }
}
