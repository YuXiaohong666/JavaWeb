package com.geo.servlet;

import com.geo.util.CookieUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CookieServlet", value = "/cookieServlet")
public class CookieServlet extends BaseServlet {
    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @描述: 修改Cookie的值
     */
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //方案1，先创建一个同名的Cookie
//        Cookie cookie = new Cookie("key1", "value2");
////        调用response.addCookie通知客户端保存修改
//        resp.addCookie(cookie);
//        System.out.println("key1的值已经修改了");

//        方案2：先查找需要修改的Cookie对象
        Cookie cookie = CookieUtils.findCookie("key1", req.getCookies());
        if (cookie != null) {
//            调用setValue方法赋予新的Cookie值
            cookie.setValue("newValue");
//            调用response.addCookie通知客户端保存修改
            resp.addCookie(cookie);
        }
    }

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @描述: 获取Cookie的值
     */
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取客户端的Cookie
        Cookie[] cookies = req.getCookies();
        Cookie iWantCookie = CookieUtils.findCookie("key1", cookies);
        resp.getWriter().write(iWantCookie.toString());
    }

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @描述: 创建Cookie对象
     */
    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.创建Cookie对象
        Cookie cookie = new Cookie("key1", "value1");
//        2.通知客户端接收Cookie
        resp.addCookie(cookie);
        resp.getWriter().println("Cookie创建成功！");

    }
}
