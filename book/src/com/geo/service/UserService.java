package com.geo.service;

import com.geo.pojo.User;

/**
 * @author yuxiaohong
 * @package com.geo.service.impl
 * @date 2024/1/11 18:22
 * @description
 */
public interface UserService {
    /*
     * @Author: yuxiaohong
     * @Description: 用户注册的业务
     * @Param: user 用户信息
     * @Return void
     */
    void registerUser(User user);

    /*
     * @Author: yuxiaohong
     * @Description: 用户登录的业务
     * @Param: user
     * @Return com.geo.pojo.User
     */
    User login(User user);

    /*
     * @Author: yuxiaohong
     * @Description: 判断用户名是否存在的业务
     * @Param: username
     * @Return boolean
     */
    boolean existsUsername(String username);
}
