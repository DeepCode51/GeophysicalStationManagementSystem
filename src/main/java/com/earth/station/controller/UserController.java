package com.earth.station.controller;

import com.earth.station.common.MD5Util;
import com.earth.station.common.SessionUtil;
import com.earth.station.model.StationUser;
import com.earth.station.service.UserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description UserController
 * @Date 2020/5/23
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    private static final Logger LOG = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    /**
     * 用户修改密码页面
     * @param request
     * @return
     */
    @RequestMapping("updatePage")
    public ModelAndView updatePage(HttpServletRequest request) {
        try {
            ModelAndView mv = new ModelAndView("user/update");
            mv.addObject("entity", request.getSession().getAttribute(SessionUtil.user));
            return mv;
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }


    /**
     * 修改
     *
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public Object update(int id, String password, HttpServletRequest request) {
        try {
            StationUser entity = userService.getById(id);
            password = password.trim();
            if(!password.equals(entity.getPassword())) {
                entity.setPassword(MD5Util.encrypt(password));
            }
            userService.update(entity);
            //修改密码重新登陆
            request.getSession().removeAttribute(SessionUtil.user);
            return this.success(null);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return this.fail("修改失败!");
    }
}