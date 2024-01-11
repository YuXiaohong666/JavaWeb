package com.geo.test;

import com.geo.pojo.User;
import com.geo.service.UserService;
import com.geo.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yuxiaohong
 * @package com.geo.test
 * @date 2024/1/11 18:32
 * @description
 */
public class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User(1, "xiaohong", "123456", "qq@c.om"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null, "xiahon", "1234", "adwa @")));
    }

    @Test
    public void existsUsername() {
        System.out.println(userService.existsUsername("xiaohong"));
    }
}