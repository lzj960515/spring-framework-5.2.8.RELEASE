package com.my.spring.test.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan(basePackages = "com.my.spring.test.simple")
@Configuration
public class SimpleMain {

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleMain.class);
	}
}
