package com.my.spring.test.autowrid;

import org.springframework.context.annotation.Primary;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Priority;

/**
 * @author Zijian Liao
 * @since
 */
//@Primary
@Priority(value = 0)
@Component
public class DependBean implements Depend, PriorityOrdered {
	@Override
	public int getOrder() {
		return 0;
	}

//	public InjectionTest injectionTest = new InjectionTest();
}
