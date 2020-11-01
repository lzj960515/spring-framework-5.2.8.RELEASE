package com.my.spring.test.share.cglib;

/**
 * 模拟Cglib代理
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class CglibConfiguration extends MyConfiguration {
	@Override
	public void before() {
		System.out.println("代理方法==before");
		super.before();
	}

	@Override
	public void after() {
		System.out.println("代理方法==after");
		super.after();
	}
}
