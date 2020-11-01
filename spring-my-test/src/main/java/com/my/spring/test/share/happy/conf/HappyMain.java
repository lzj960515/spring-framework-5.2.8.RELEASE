package com.my.spring.test.share.happy.conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * happy main
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class HappyMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HappyConfiguration.class);
		HappyBean happyBean = context.getBean("happyBean", HappyBean.class);
		System.out.println(happyBean);

		HappyWrapBean happyWrapBean = context.getBean("happyWrapBean", HappyWrapBean.class);
		happyWrapBean.printBean();

	}
}
