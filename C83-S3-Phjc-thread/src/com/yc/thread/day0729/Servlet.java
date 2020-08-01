package com.yc.thread.day0729;

import java.io.IOException;

import com.yc.thread.day0730.HttpServletRequest;
import com.yc.thread.day0730.HttpServletResponse;

/**
 * Servlet继承关系
 * Servlet-->GenriceServlet-->HttpServlet
 */
public interface Servlet {
	

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException;
}
