package com.yc.thread.day0729;

import java.io.PrintWriter;

import com.yc.thread.day0730.HttpServlet;
import com.yc.thread.day0730.HttpServletRequest;
import com.yc.thread.day0730.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out=response.getWriter();
		//输出到页面
		out.print("<h1>hello world</h1>");
		
		System.out.println("hello world!");
		
	}
}
