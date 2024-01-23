package com.geo.web;

import com.geo.pojo.User;
import com.geo.service.UserService;
import com.geo.service.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author yuxiaohong
 * @package com.geo.web
 * @date 2024/1/23 15:04
 * @description 处理用户的登录业务
 */
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //调用userService.login()处理登录业务
        User login = userService.login(new User(null, username, password, null));
        if (login == null) {
            //说明登录失败
            req.getRequestDispatcher("/pages/user/login.html").forward(req, resp);
        } else {
            //说明登录成功，跳转到登录成功页面
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req, resp);
        }
    }
}
