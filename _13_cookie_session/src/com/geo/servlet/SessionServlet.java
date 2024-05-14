package com.geo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SessionServlet", value = "/sessionServlet")
public class SessionServlet extends BaseServlet {
    //    往Session域中存放数据
    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1", "value1");
    }

    //    往Session域中读取数据
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object key1 = req.getSession().getAttribute("key1");
        resp.getWriter().write("" + key1);
    }

    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        创建Session会话对象
        HttpSession session = req.getSession();
//        判断Session是不是新创建出来的
        boolean aNew = session.isNew();
        System.out.println(aNew);
//        获取Session会话对象的id
        String id = session.getId();
        System.out.println(id);
        resp.getWriter().write("得到的Session的id是" + id + "<br>");
        resp.getWriter().write("这个Session是否是新创建的" + aNew + "<br>");
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("Session会话的默认超时时长为" + maxInactiveInterval + "秒");
    }
}
