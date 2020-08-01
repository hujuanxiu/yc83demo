package com.yc.thread.day0725;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class FileServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(8888);
		System.out.println("服务器启动成功,监听8888端口");
		Socket socket=server.accept();
		
		
		
		
		new Thread() {
			DataInputStream in=new DataInputStream(socket.getInputStream());
			
			FileOutputStream out;
			public void run() {
				try {
					String fileName=in.readUTF();
					long fileLength=in.readLong();
					File path=new File("E:/");
					if(!path.exists()) {
						path.mkdir();
					}
					File file=new File(path.getAbsolutePath()+File.separatorChar+fileName);
					System.out.println("file:"+file);
					out=new FileOutputStream(file);
					
					byte[] bytes = new byte[1024];
					int length = 0;
					out.write(bytes, 0, length);
					out.flush();
					
					System.out.println("======== 文件接收成功 [File Name：" + fileName + "] ");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		
		
	}
}
