package com.my.spring.test.aop;

import org.springframework.stereotype.Service;

/**
 * @author Zijian Liao
 * @since
 */
@Service("service")
public class ServiceImpl implements IService{

	/**
	 * 切点表达式可以匹配的方法
	 */
	@Override
	public void doService() {
		System.out.println("do service ...");
	}

	@Override
	public void notMatchMethod() {
		System.out.println("ServiceImpl.notMatchMethod");
	}
}
