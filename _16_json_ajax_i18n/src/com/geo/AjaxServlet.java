package com.geo;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author YuHong
 * #Description AjaxServlet
 * #Date: 2024/5/24 22:54
 */
@WebServlet(name = "AjaxServlet", value = "/ajaxServlet")
public class AjaxServlet extends BaseServlet {
    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ajax请求过来了");
        Person person = new Person(2, "小杰");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        resp.getWriter().write(json);
    }

    protected void JQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JQueryAjax调用了");
        Person person = new Person(2, "小杰");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        resp.getWriter().write(json);
    }

    protected void JQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JQueryGet调用了");
        Person person = new Person(2, "小杰");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        resp.getWriter().write(json);
    }

    protected void JQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JQueryPost");
        Person person = new Person(2, "小杰");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        resp.getWriter().write(json);
    }

    protected void JQueryGetJson(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JQueryGetJson");
        Person person = new Person(2, "小杰");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        resp.getWriter().write(json);
    }
}
