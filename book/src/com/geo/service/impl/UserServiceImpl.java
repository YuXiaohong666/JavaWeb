package com.geo.service.impl;

import com.geo.dao.UserDao;
import com.geo.dao.impl.UserImpl;
import com.geo.pojo.User;
import com.geo.service.UserService;
import jdk.jshell.spi.ExecutionControl;

/**
 * @author yuxiaohong
 * @package com.geo.service.impl
 * @date 2024/1/11 18:27
 * @description
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserImpl();

    @Override
    public void registerUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            // 说明没查到，表示可用
            return false;
        }
        return true;
    }
}
