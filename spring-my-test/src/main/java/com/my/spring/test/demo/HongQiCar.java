package com.my.spring.test.demo;

import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
//@Component
public class HongQiCar implements Car {

	@Override
	public void run() {
		System.out.println("hongqi car running");
	}
}
