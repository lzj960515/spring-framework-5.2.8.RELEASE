package com.my.spring.test.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
//@Component
public class EagerBean implements InitializingBean {

	private final LazyBean lazyBean;

	@Autowired
	public EagerBean(LazyBean lazyBean){
		this.lazyBean = lazyBean;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "EagerBean{" +
				"lazyBean=" + lazyBean +
				'}';
	}
}
