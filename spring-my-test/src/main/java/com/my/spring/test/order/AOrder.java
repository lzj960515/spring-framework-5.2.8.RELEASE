package com.my.spring.test.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 测试bean的生成顺序
 * @author Zijian Liao
 * @since 1.0.0
 */
@Order(2)
@Component
public class AOrder {

	static {
		System.out.println("init aorder");
	}
}
