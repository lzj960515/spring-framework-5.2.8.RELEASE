package com.my.spring.test;

import com.my.spring.test.factory.Wheel;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

/**
 * 测试是否构建成功
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan(basePackages = {"com.my.spring.test"})
@Configuration
//@Import(value = {Bus.class})
public class QuickStart extends SuperQuickStart{

//	@Bean(initMethod = "init")
//	public Car car(){
//		return new Car();
//	}

//	@Bean
//	public BananaFactory bananaFactory(){
//		return new BananaFactory();
//	}

//	@Bean
//	public Car car(){
//		return new Car();
//	}
//
//	@Bean
//	public Wheel wheel(){
//		return new Wheel();
//	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuickStart.class);
//		Banana car = context.getBean("bananaFactory", Banana.class);
//		Wheel wheel = context.getBean("wheel", Wheel.class);
//		System.out.println(wheel);
		// 加上&前缀则返回工厂bean，且该bean必须是个工厂bean，普通bean则抛出异常
//		System.out.println(context.getBean("instanceBFactory"));
//		System.out.println(context.getBean("bananaFactory"));
//		System.out.println("aaaaaaa");
		System.out.println(context.getBean("beanByType"));
		context.close();
	}

}
