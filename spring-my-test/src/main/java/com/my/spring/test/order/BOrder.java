package com.my.spring.test.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Order(1)
@Component
public class BOrder {

	static {
		System.out.println("init border");
	}
}
