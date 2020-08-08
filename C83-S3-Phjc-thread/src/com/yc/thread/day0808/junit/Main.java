package com.yc.thread.day0808.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) throws  IllegalArgumentException, InvocationTargetException, IllegalAccessException {
		DemoTest dt=new DemoTest();
		Class<?> cls=dt.getClass();
		Method afterMethod= getMethod(cls, After.class);
		Method beforeMethod=getMethod(cls, Before.class);
		//获取所有的方法并进行遍历
		for(Method m:cls.getMethods()) {
			
			if(m.getAnnotation(Test.class)!=null) {
				//动态执行方法，junit的测试方法不能定义参数
				try {
					if(beforeMethod!=null) {
						beforeMethod.invoke(dt);
					}
					m.invoke(dt);
					if(afterMethod!=null) {
						afterMethod.invoke(dt);
					}
				} catch (IllegalAccessException | IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					//如果是dt.m方法出现业务异常
					//将会封装 该异常中
					e.printStackTrace();
				} 
			}
			
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static Method getMethod(Class<?> cls,@SuppressWarnings("rawtypes") Class annocls) {
        for(Method m:cls.getMethods()) {
			if(m.getAnnotation(annocls)!=null) {
				return m;
			}
		}
        return null;
	}
}

