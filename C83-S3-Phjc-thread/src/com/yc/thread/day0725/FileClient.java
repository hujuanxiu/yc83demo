package com.yc.thread.day0725;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;



public class FileClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket=new Socket("127.0.0.1",8888);
		
		//返回地址对象
		InetAddress myAddress=socket.getInetAddress();
		SocketAddress otherAddress=socket.getRemoteSocketAddress();
		System.out.println("我的地址:"+myAddress);
		System.out.println("客户端的地址:"+otherAddress);
		
		File file=new File("D:/双色球.txt");
		FileInputStream in=new FileInputStream(file);
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		out.writeUTF(file.getName());
		out.flush();
		out.writeLong(file.length());
		out.flush();
		System.out.println("======== 开始传输文件 ========");
		byte[] bytes = new byte[1024];
		int length = 0;
		
		while ((length = in.read(bytes, 0, bytes.length)) != -1) {
			out.write(bytes, 0, length);
			out.flush();
		}
		System.out.println("======== 文件传输成功 ========");

	}
	
}
