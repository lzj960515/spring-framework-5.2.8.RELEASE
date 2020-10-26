package com.my.spring.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since
 */
@Component
@Lazy
public class InstanceA {

	@Autowired
	private InstanceB instanceB;

	@Override
	public String toString() {
		return "InstanceA{" +
				"instanceB=" + instanceB +
				'}';
	}
}
