package com.my.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since
 */
@Component
public class InstanceAFactory implements FactoryBean<InstanceBFactory>, ApplicationContextAware {
	private ApplicationContext applicationContext;

	@Override
	public InstanceBFactory getObject() throws Exception {
		return applicationContext.getBean("instanceBFactory",InstanceBFactory.class);

	}

	@Override
	public Class<?> getObjectType() {
		return InstanceBFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
