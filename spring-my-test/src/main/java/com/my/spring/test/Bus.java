package com.my.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since
 */
//@Component
public class Bus {

	@Autowired
	private Banana banana;

	@Override
	public String toString() {
		return "Bus{" +
				"banana=" + banana +
				'}';
	}
}
