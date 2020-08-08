package com.yc.thread.day0808.junit;


public class DemoTest {

	@Before
	public void before() {
		System.out.println("测试方法前执行的方法");
	}
	
	@After
	public void after() {
		System.out.println("测试方法后执行的方法");
	}
	
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
    public void test2() {
		System.out.println("test2");
	}
    
    public void test3() {
    	System.out.println("test3");
	}


}
