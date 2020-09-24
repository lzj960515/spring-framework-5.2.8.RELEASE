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
@ComponentScan(basePackages = {"com.my.spring.test"}, lazyInit = true)
@Configuration
@Import(value = {MyImport.class, Bus.class})
public class QuickStart extends SuperQuickStart{

	@Bean(initMethod = "init")
	public Car car(){
		return new Car();
	}

//	@Bean
//	public Wheel wheel(){
//		return new Wheel();
//	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuickStart.class);
		Car car = context.getBean("car", Car.class);
		Wheel wheel = context.getBean("wheel", Wheel.class);
		System.out.println(wheel);

	}

}
