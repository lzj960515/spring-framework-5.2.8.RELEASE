package com.my.spring.test.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
public class Main {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(FooConfig.class);
	}
}
