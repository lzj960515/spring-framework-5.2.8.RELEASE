package com.my.spring.test.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan
public class EventMain {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(EventMain.class);
	}
}
