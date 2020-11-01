package com.my.spring.test.test;

import com.my.spring.test.factory.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
public class Car {

	private Wheel wheel;

	public Car(Wheel wheel){
		this.wheel = wheel;
	}

	public Car(){}

	@Autowired
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void init(){
		System.out.println("car init!");
	}
}
