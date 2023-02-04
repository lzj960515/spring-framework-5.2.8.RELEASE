package com.my.spring.test.interrupt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class Car {

	@Autowired
	private Person person;

	public void checkPerson(){
		if(person == null){
			System.out.println("person is null");
		}
	}
}
