package com.yc.thread.day0730;

import java.io.IOException;

import com.yc.thread.day0729.Servlet;

public class LoginPageServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Cookie[] cookies=request.getCookies();
		//System.out.println(cookies[0]);
		//System.out.println(cookies[1]);
		
		response.getWriter().append("用户名:<input value='"+cookies[0].getValue()+"'><br>");
		response.getWriter().append("密码:<input value=''><br>");
		response.getWriter().append("<input type='button' value='登录'><br>");
	}

}
