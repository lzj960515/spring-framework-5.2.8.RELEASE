package com.my.spring.test.cycle;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 工厂BeanB
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
//@Component
public class FactoryBeanB implements FactoryBean<NormalBeanB> {
	@Autowired
	private ApplicationContext context;
	@Override
	public NormalBeanB getObject() throws Exception {
		NormalBeanB normalBeanB = new NormalBeanB();
		NormalBeanA normalBeanA = context.getBean("factoryBeanA", NormalBeanA.class);
		normalBeanB.setNormalBeanA(normalBeanA);
		return normalBeanB;
	}

	@Override
	public Class<?> getObjectType() {
		return NormalBeanB.class;
	}
}
