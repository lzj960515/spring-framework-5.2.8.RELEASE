package com.my.spring.test.test;

/**
 * @author Zijian Liao
 * @since
 */
public class Impl implements Inter1,Inter2 {
	@Override
	public String hello() {
		return "impl";
	}
}
