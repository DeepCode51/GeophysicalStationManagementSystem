package com.earth.station.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description CookieUtil
 * @Author yeyu
 * @Date 2020/5/23
 */
public class CookieUtil {

    /**
     * 获取cookie
     */
    public static String getCookie(HttpServletRequest request, String name) {
        for (Cookie cookie : request.getCookies()) {
            if (cookie.getName().equalsIgnoreCase(name)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}