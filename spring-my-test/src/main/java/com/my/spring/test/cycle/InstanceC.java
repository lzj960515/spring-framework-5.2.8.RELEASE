package com.my.spring.test.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class InstanceC {

	@Autowired
	private InstanceA instanceA;

	/*public void run(){
		System.out.println("instanceC run");
	}*/
}
