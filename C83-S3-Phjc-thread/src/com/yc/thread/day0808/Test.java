package com.yc.thread.day0808;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//只用注解的注解来限定该注解被标注的位置
@Target(value= {ElementType.METHOD,
		ElementType.LOCAL_VARIABLE,
		ElementType.TYPE})
//持久性设置
//源代码阶段
//编译期阶段
//运行期阶段
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {

	String value() default "";
	
}

@Target(value = {ElementType.METHOD})
@interface Select{
	//定义注解的属性：定义语法类似于接口的方法
	//如果一个属性定义的数组类型，那么使用数据语法复制
	//但是如果只赋值一个元素，可以使用单变量形式
	String [] value();
	
	//所有的注解属性都必须赋值，如果不赋值，那么要设置 默认值
	int age() default 100;
	
	//如果某个属性的名称是value，那么这个属性就是默认属性
	//默认属性可以不写属性名就进行赋值
	//前提是只填写该属性，其他属性不填写
	
	
	/**
	 * 扩展：请将该注解定义在只能定义在方法参数上
	 */
}
