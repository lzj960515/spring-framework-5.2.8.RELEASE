package com.my.spring.test;

/**
 * @author Zijian Liao
 * @since
 */
public interface Inter1 {

	default String hello(){
		return "hello 1";
	}
}
