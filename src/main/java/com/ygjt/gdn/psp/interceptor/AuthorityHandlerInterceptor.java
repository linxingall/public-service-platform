package com.ygjt.gdn.psp.interceptor;

import com.ygjt.gdn.psp.utils.Constants;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthorityHandlerInterceptor extends HandlerInterceptorAdapter
{
	private static final String LOGIN_URL = "/login.htm";
	@Override
	public boolean preHandle(HttpServletRequest request,
							 HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession(true);
		// 从session 里面获取用户名的信息
		Object obj = session.getAttribute(Constants.USER_AGENT_IN_REQUEST);
		// 判断如果没有取到用户信息，就跳转到登陆页面，提示用户进行登陆
		if (obj == null || "".equals(obj.toString())) {
			response.sendRedirect(LOGIN_URL);
		}
		return true;
	}

}
