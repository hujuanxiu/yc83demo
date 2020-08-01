package com.yc.thread.day0730;

import java.io.IOException;

import com.yc.thread.day0729.Servlet;

/**
 * HttpServlet负责根据请求方法method调用对应的doXXX方法
 * service()负责判断和转发
 * doXXX()负责处理流对应的method
 *
 */
public class HttpServlet implements Servlet{

	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		if("GET".equals(request.getMethod())) {
			doGet(request,response);
		}else if("POST".equals(request.getMethod())) {
			doPost(request,response);
		}else  if("PUT".equals(request.getMethod())) {
			doPut(request,response);
		}else if("DELETE".equals(request.getMethod())) {
			doDelete(request,response);
		}else {
			
		}
		
		response.setStatus(200, "OK");
		response.flushBuffer();
	}

	public void doDelete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public void doPut(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
