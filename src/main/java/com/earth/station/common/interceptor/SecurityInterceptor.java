package com.earth.station.common.interceptor;

import com.earth.station.common.CookieUtil;
import com.earth.station.common.SessionUtil;
import com.earth.station.common.constant.UserConstant;
import com.earth.station.common.constant.UserConstant.Level;
import com.earth.station.model.StationUser;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SecurityInterceptor extends HandlerInterceptorAdapter {

	private List<String> excludedUrls;

	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		String servletPath = req.getServletPath();
		for (String url : excludedUrls) { // 放行的请求
			if (servletPath.startsWith(url)) {
				return true;
			}
		}
		StationUser user = (StationUser) req.getSession().getAttribute(SessionUtil.user);
		if (user == null) {//未登录或会话超时
			resp.sendRedirect(getDomain(req) + "login.html");
			return false;
		}
		if (Level.ADMIN.equals(user.getLevel())) {
			String flag = req.getServletContext().getAttribute(user.getUserName()).toString();
			String cookieFlag = CookieUtil.getCookie(req, user.getUserName());
			if (cookieFlag == null || !cookieFlag.equalsIgnoreCase(flag)) {
				resp.sendRedirect(getDomain(req) + "login.html");
				return false;
			}
		}
		return true;
	}

	/**
	 * 获得域名
	 * 
	 * @param request
	 * @return
	 */
	protected String getDomain(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
		return basePath;
	}

}
