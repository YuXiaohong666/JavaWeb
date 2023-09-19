package com.example._06servlet; /**
 * @author yuxiaohong
 * @package ${PACKAGE_NAME}
 * @date 2023/3/27 23:07
 * @description ${DESCRIPTION}
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class HelloServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet3的doGet方法");
          }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet3的doPost方法");
    }
}
