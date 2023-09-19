package com.example._06servlet; /**
 * @author yuxiaohong
 * @package ${PACKAGE_NAME}
 * @date 2023/3/28 15:05
 * @description ${DESCRIPTION}
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.获取web.xml中配置的上下文参数context-param
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("context-param参数username的值是："+username);
        String password = context.getInitParameter("password");
        System.out.println("context-param参数password的值是："+password);
//        2.获取当前的工程路径：/工程路径
        System.out.println("当前工程路径："+context.getContextPath());
//        3.获取工程部署后在服务器硬盘上的绝对路径
        /**
         * 斜杠被服务器解析地址为：http://ip:port/工程名/
         * */
        System.out.println("工程部署的路径是："+context.getRealPath("/"));
        System.out.println("工程下css目录的绝对路径是："+context.getRealPath("/css"));
        System.out.println("工程下img目录的绝对路径是："+context.getRealPath("/image/QQ图片20220907091157.jpg"));
//        4.像Map一样存取数据

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
