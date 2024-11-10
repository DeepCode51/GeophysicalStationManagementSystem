package com.earth.station.controller;

import com.earth.station.common.SessionUtil;
import com.earth.station.model.StationUser;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController extends BaseController{
	private static final Logger LOG = Logger.getLogger(IndexController.class);
	/**
	 * 首页
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request) {
		try {
			StationUser user = (StationUser) request.getSession().getAttribute(SessionUtil.user);
			ModelAndView mv = new ModelAndView("index/index");
			mv.addObject("user", user);
			return mv;
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}
}
