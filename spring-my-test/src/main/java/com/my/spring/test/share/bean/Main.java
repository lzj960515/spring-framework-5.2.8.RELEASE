package com.my.spring.test.share.bean;

import com.my.spring.test.share.event.MyApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * main
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		System.out.println(context.getBean("myBean"));
		context.publishEvent(new MyApplicationEvent("张三放了个屁"));
		context.close();
	}
}
