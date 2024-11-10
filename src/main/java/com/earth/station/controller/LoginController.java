package com.earth.station.controller;

import com.earth.station.common.MD5Util;
import com.earth.station.common.SessionUtil;
import com.earth.station.common.constant.UserConstant;
import com.earth.station.common.constant.UserConstant.Level;
import com.earth.station.model.StationUser;
import com.earth.station.service.UserService;
import java.util.UUID;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")
@RequestMapping
public class LoginController extends BaseController {

    private static final Logger LOG = Logger.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    /**
     * 首页
     */
    @RequestMapping("/login")
    public ModelAndView login() {
        try {
            ModelAndView mv = new ModelAndView("login/login");
            return mv;
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * 登录
     */
    @RequestMapping(value = "/doLogin")
    @ResponseBody
    public Object doLogin(
            HttpServletRequest request, HttpServletResponse response,
            String userName,
            String pwd) {
        try {
            //参数格式错误
            if (StringUtils.isBlank(userName) || StringUtils.isBlank(pwd)) {
                return this.fail("参数格式错误");
            }
            StationUser user = userService.getByUserName(userName);

            if (user == null) {
                return this.fail("账号不存在");
            }
            if (!MD5Util.validPassword(pwd, user.getPassword())) {
                return this.fail("密码错误");
            }
            //保证admin只能在一台机器上登陆
            request.getSession().setAttribute(SessionUtil.user, user);
            if (Level.ADMIN.equals(user.getLevel())) {
                String flag = UUID.randomUUID().toString();
                request.getServletContext().setAttribute(user.getUserName(), flag);
                Cookie cookie = new Cookie(user.getUserName(), flag);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
            return this.success("登录成功");
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return this.fail("系统错误");
    }

    /**
     * 退出
     */
    @RequestMapping("/loginout")
    @ResponseBody
    public Object loginout(HttpServletRequest request) {
        try {
            request.getSession().setAttribute(SessionUtil.user, null);
            return this.success(null);
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e.getMessage(), e);
        }
        return super.fail("退出失败");
    }
}
