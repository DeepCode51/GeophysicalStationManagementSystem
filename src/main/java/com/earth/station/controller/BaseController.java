package com.earth.station.controller;

import com.earth.station.common.ResultInfo;
import javax.servlet.http.HttpServletRequest;

public class BaseController {
	/**
	 * 请求成功
	 * 
	 * @param data 请求成功返回的内容
	 * @return
	 */
	public Object success(Object data) {
		ResultInfo<Object> resultInfo = new ResultInfo<Object>();
		resultInfo.setCode(200);
		resultInfo.setData(data);
		return resultInfo;
	}

	/**
	 * 请求失败
	 * 
	 * @param msg 失败信息
	 * @return
	 */
	public Object fail(String msg) {
		ResultInfo<Object> resultInfo = new ResultInfo<Object>();
		resultInfo.setCode(300);
		resultInfo.setData(msg);
		return resultInfo;
	}
	/**
     * 获得域名
     * @param request
     * @return
     */
	protected String getDomain(HttpServletRequest request){
		String path = request.getContextPath();
	    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
	    return basePath;
	}
}
