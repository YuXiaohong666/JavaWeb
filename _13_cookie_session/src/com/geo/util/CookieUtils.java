package com.geo.util;

import jakarta.servlet.http.Cookie;

public class CookieUtils {
    /**
     * @param name
     * @param cookies
     * @return
     */
    public static Cookie findCookie(String name, Cookie[] cookies) {
        if (name == null || cookies == null || cookies.length == 0) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())) {
                System.out.println("找到了需要的cookie");
                return cookie;
            }
        }
        return null;
    }
}
