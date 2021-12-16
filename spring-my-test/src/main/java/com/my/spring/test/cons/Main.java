package com.my.spring.test.cons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan(basePackages = {"com.my.spring.test.cons"})
@Configuration
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
	}
}
