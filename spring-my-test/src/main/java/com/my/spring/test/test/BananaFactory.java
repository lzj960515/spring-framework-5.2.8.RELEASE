package com.my.spring.test.test;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
public class BananaFactory implements FactoryBean<Banana> {
	@Override
	public Banana getObject() throws Exception {
		return new Banana();
	}

	@Override
	public Class<?> getObjectType() {
		return Banana.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
