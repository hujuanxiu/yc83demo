package com.yc.thread.day0730;

import java.io.IOException;


public class CookieServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		/**
		 * 向浏览器发送Cookie值name=lisi
		 */
		Cookie cookie=new Cookie("name","lisi");
		response.addCookie(cookie);
		
		response.getWriter().append("cookie");
		
		/**
		 * 请为Cookie对象设置过期时间maxAge
		 */
		
	}

	
}
