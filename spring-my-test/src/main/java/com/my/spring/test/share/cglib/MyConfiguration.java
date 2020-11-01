package com.my.spring.test.share.cglib;

/**
 * 模拟Cglib代理
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class MyConfiguration {

	public void before(){
		System.out.println("MyConfiguration.before");
		this.after();
	}

	public void after(){
		System.out.println("MyConfiguration.after");
	}
}
