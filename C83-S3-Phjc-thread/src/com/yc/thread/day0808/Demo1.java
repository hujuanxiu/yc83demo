package com.yc.thread.day0808;

import java.util.List;

public class Demo1 {

	//注释1
	@Select(value = {"select * from a","select * from b"})
	public void test() {
		@Test
		int a;
	}
	
	//注释2
	@Select(value = "select * from a",age=1)
	public void test1() {
		@Test
		int a;
	}
	
	//注释3
	@Select("select * from a")
	public void test2() {
		@Test
		int a;
	}
	
	
	@Override
	//重写注解（父类必须有该方法）
	public String toString() {
		@SuppressWarnings("rawtypes")
		List a=null;		
		System.out.println(a);
		return super.toString();
	}
	
	
	
}
