package com.my.spring.test.test;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
//@Component
@Lazy
public class LazyBean {

	public LazyBean(){
		System.out.println("LazyBean.LazyBean");
	}
}
