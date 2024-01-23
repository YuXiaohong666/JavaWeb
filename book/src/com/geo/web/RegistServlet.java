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
 * @date 2024/1/15 12:42
 * @description
 */
public class RegistServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        // 2.检查验证码是否正确，写死，要求：abcde
        if ("abcde".equalsIgnoreCase(code)) {
            // 检查用户名是否可用
            if (userService.existsUsername(username)) {
                // 返回true说明用户名已存在
                System.out.println("用户名" + username + "已存在");
                // 跳回注册页面
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
            } else {
                // 表示此用户名可用，调用UserService方法存放到数据库当中
                userService.registerUser(new User(null, username, password, email));
                // 跳转到注册成功的页面
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
            }

        } else {
            System.out.println("验证码错误，验证码是" + code);
            // 验证码错误，跳回注册页面
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }
    }
}
