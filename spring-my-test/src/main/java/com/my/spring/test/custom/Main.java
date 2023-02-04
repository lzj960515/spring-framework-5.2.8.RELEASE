package com.my.spring.test.custom;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		BeanDefinition interfaceMapper = context.getBeanDefinition("interfaceMapper");
		InterfaceMapper mapper = (InterfaceMapper) context.getBean("interfaceMapper");
		mapper.hello();
	}
}
