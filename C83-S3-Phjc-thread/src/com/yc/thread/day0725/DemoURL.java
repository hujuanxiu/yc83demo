package com.yc.thread.day0725;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class DemoURL {

	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.hyycinfo.com");
		System.out.println(url.getProtocol());//获取url的协议 http
		System.out.println(url.getPort());//获取url的端口 -1 80
		System.out.println(url.getPath());//获取url的路径
		System.out.println(url.getHost());//获取url的域名 www.hyycinfo.com
		System.out.println(url.getFile());//获取url的资源名
		System.out.println(url.getQuery());//获取url的地址中的参数 null
		URLConnection conn=url.openConnection();
		
		System.out.println(conn.getLastModified());//目标资源的最后修改时间0
		System.out.println(conn.getContentLengthLong());//目标资源的大小 -1 没有获取到
		System.out.println(conn.getContentType());//目标资源的类型js html  text/html;charset=UTF-8
		
		
		
		System.out.println("-----------------------------------");
		//获取输入流
		InputStream in=conn.getInputStream();
		
		byte [] buffer=new byte[1024];
		
		int count;
		while(( count=in.read(buffer)) >0 ) {
			System.out.println(new String(buffer,0,count));
		}
		
		in.close();
		
	}
}
