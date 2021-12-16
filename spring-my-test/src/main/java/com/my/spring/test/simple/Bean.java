package com.my.spring.test.simple;

import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class Bean {

	static {
		System.out.println("bean init");
	}
}
