package com.yc.thread.day0725;

import java.util.ArrayList;
import java.util.List;

/**
 * 修饰为同步
 *
 */


public class Demo3 {

	//存放数字的集合
	private List<String> list=new ArrayList<String>();
	
	
	//同步方法
	public void add(String i) {
		list.add(i);
	}
	
	public String pop() {
		//同步代码块， ？？？是同步的资源对象，也就是要锁定的对象
		synchronized (this) {
			return list.remove(0);
		}
		
	}
	
	public synchronized int size() {
		return list.size();
	}
	
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		
		Thread t1=new Thread("线程1") {
		
			public void run() {
				while(true) {
					if(d.size()<10) {
						for(int i=0;i<10;i++) {
							System.out.println(Thread.currentThread().getName()+":"+i);
							d.add(""+i);
						}
					/*}else {
						Thread.sleep(1000);
					}*/
				}
			}	
		  }
		};
		Thread t2=new Thread("------线程2") {
			public void run() {
				while(true) {
					if(d.size()>0) {
						
						System.out.println(Thread.currentThread().getName()+":"+d.pop());
						
					}


					}
				}
			
		};
		
		Thread t3=new Thread("=======线程3") {
			public void run() {
				while(true) {
					if(d.size()>0) {
						System.out.println(Thread.currentThread().getName()+":"+d.pop());
					}
				}
				
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		
	    
		
	}
}
	

