package com.mars.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.mars.utils.RequestIPUtil;


public class GlobalInterceptor implements HandlerInterceptor{

	Logger logger = LogManager.getLogger(GlobalInterceptor.class);
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
//		logger.info("afterCompletion   " + arg0.getRequestURI());
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
//		logger.info("postHandle " + arg0.getRequestURI());
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {
		
//		logger.info("preHandle  " + arg0.getRequestURI());
		logger.info("远程请求地址:" + RequestIPUtil.getIpAddr(request) + ",路径:"
				+ request.getRequestURI());
		return true;
	}
	
}
