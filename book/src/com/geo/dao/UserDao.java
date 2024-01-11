package com.geo.dao;

import com.geo.pojo.User;

/**
 * @author yuxiaohong
 * @package com.geo.dao.impl
 * @date 2024/1/9 16:05
 * @description 这个接口主要用于处理用户的登录操作
 */
public interface UserDao {

    /*
     * @Author: yuxiaohong
     * @Description: 根据用户查询用户信息
     * @Param: username 用户名
     * @Return 如果返回null，说明没有这个用户，反之亦然。
     */
    User queryUserByUsername(String username);

    /*
     * @Author: yuxiaohong
     * @Description: 通过用户名和密码查询是否正确
     * @Param: username
     * @param password
     * @Return com.geo.pojo.User
     */
    User queryUserByUsernameAndPassword(String username, String password);

    /*
     * @Author: yuxiaohong
     * @Description:保存用户的信息（注册）
     * @Param: user 用户
     * @Return int
     */
    int saveUser(User user);
}
