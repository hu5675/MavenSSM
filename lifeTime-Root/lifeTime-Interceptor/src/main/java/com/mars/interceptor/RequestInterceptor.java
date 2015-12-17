package com.mars.interceptor;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestInterceptor implements HandlerInterceptor {

	static Logger logger = LogManager.getLogger(GlobalInterceptor.class);

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		

	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse arg1, Object arg2) throws Exception {
		
		// RequestContext context = new RequestContext(request);
		// Locale local = context.getLocale();

		// HttpServletRequest req = new HttpServletRequestWrapper(request);
		// ServletInputStream sis = null;
		// try {
		// request.setCharacterEncoding("UTF-8");
		// int size = request.getContentLength();
		// InputStream is = request.getInputStream();
		// byte[] reqBodyBytes = readBytes(is, size);
		// String res = new String(reqBodyBytes);
		// logger.info("request body :" + res);
		// } finally {
		// if (sis != null)
		// sis.close();
		// }
		
		String securityID = request.getParameter("secureID");
		String userToken = request.getParameter("userToken");

		return true;
	}

	public static final byte[] readBytes(InputStream is, int contentLen) {
		if (contentLen > 0) {
			int readLen = 0;
			int readLengthThisTime = 0;
			byte[] message = new byte[contentLen];
			try {
				while (readLen != contentLen) {
					readLengthThisTime = is.read(message, readLen, contentLen
							- readLen);
					if (readLengthThisTime == -1) {// Should not happen.
						break;
					}
					readLen += readLengthThisTime;
				}
				return message;
			} catch (IOException e) {
				// Ignore
				// e.printStackTrace();
			}
		}
		return new byte[] {};
	}

}
