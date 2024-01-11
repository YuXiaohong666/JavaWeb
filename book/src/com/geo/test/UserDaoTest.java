package com.geo.test;

import com.geo.dao.UserDao;
import com.geo.dao.impl.UserImpl;
import com.geo.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yuxiaohong
 * @package com.geo.test
 * @date 2024/1/11 17:21
 * @description
 */
public class UserDaoTest {
    @Test
    public void queryUserByUsername() {
        UserDao userDao = new UserImpl();
        if (userDao.queryUserByUsername("admin1") == null) {
            System.out.println("用户名可用！");
        } else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        UserDao userDao = new UserImpl();
        if (userDao.queryUserByUsernameAndPassword("admin", "admin123") == null) {
            System.out.println("账号或密码不正确！");
        } else {
            System.out.println("登录成功！");
        }
    }

    @Test
    public void saveUser() {
        UserDao userDao = new UserImpl();
        System.out.println(userDao.saveUser(new User(1, "xiaojie", "11111", "135611")));
    }
}