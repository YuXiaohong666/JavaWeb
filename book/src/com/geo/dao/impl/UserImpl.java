package com.geo.dao.impl;

import com.geo.dao.UserDao;
import com.geo.pojo.User;

/**
 * @author yuxiaohong
 * @package com.geo.dao.impl
 * @date 2024/1/11 17:12
 * @description
 */
public class UserImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ? and password = ?";
        return queryForOne(User.class, sql, username, password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(`username`,`password`,`email`) values(?,?,?);";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }
}
