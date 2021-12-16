package com.my.spring.test.cycle;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * main
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan(basePackages = {"com.my.spring.test.cycle"})
@Configuration
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
//		InstanceB instanceB = context.getBean(InstanceB.class);

//		InstanceA instanceA = context.getBean(InstanceA.class);

//		instanceB.incrementA();
//		instanceA.sout();
//		System.out.println(context.getBean("factoryBeanB"));
//		System.out.println(context.getBean(FactoryBeanB.class));

		// 先创建A对象
//		NormalBeanA normalBeanA = new NormalBeanA();
		// 创建B对象
//		NormalBeanB normalBeanB = new NormalBeanB();
		// 将A对象的引用赋给B
//		normalBeanB.setNormalBeanA(normalBeanA);
		// 再将B赋给A
//		normalBeanA.setNormalBeanB(normalBeanB);

//		System.out.println(normalBeanA);
//		System.out.println(normalBeanB);
	}
}
