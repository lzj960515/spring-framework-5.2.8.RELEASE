package com.my.spring.test;

/**
 * @author Zijian Liao
 * @since
 */
public interface Inter2 {

	default String hello(){
		return "hello 2";
	}
}
