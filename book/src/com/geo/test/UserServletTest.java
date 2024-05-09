package com.geo.test;

import java.lang.reflect.Method;

public class UserServletTest {
    public void login() {
        System.out.println("这是login方法");
    }

    public void regist() {
        System.out.println("这是regist方法");
    }


    public static void main(String[] args) {
        String action = "regist";
        try {
//            获取action业务鉴别字符串，获取相应的业务，方法反射对象
            Method method = UserServletTest.class.getDeclaredMethod(action);
            System.out.println(method);
//            调用对应的业务方法
            method.invoke(new UserServletTest());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
