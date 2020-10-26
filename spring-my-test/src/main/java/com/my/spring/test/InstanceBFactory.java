package com.my.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since
 */
@Component
@Lazy
public class InstanceBFactory implements FactoryBean<InstanceB>, ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public InstanceB getObject() throws Exception {
		InstanceA instanceA = applicationContext.getBean("instanceA", InstanceA.class);
		InstanceB instanceB = new InstanceB();
		instanceB.setInstanceA(instanceA);
		return instanceB;
	}

	@Override
	public Class<?> getObjectType() {
		return InstanceB.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
