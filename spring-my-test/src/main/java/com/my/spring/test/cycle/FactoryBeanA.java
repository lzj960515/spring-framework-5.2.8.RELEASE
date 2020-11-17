package com.my.spring.test.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 工厂Bean B
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class FactoryBeanA implements FactoryBean<NormalBeanA> {
	@Autowired
	private ApplicationContext context;

	@Override
	public NormalBeanA getObject() throws Exception {
		NormalBeanA normalBeanA = new NormalBeanA();
		NormalBeanB normalBeanB = context.getBean("factoryBeanB", NormalBeanB.class);
		normalBeanA.setNormalBeanB(normalBeanB);
		return normalBeanA;
	}

	@Override
	public Class<?> getObjectType() {
		return NormalBeanA.class;
	}
}
