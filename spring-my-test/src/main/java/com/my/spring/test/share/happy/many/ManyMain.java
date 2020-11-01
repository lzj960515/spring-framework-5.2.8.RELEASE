package com.my.spring.test.share.happy.many;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * main
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Configuration
@ComponentScan(basePackages = {"com.my.spring.test.share.happy.many"})
public class ManyMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManyMain.class);
		Controller controller = context.getBean("controller", Controller.class);
//		controller.printService();
		controller.printServiceList();
		controller.printServiceMap();
	}
}
