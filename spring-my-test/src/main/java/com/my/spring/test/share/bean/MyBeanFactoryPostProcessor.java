package com.my.spring.test.share.bean;

import com.my.spring.test.share.factory.Girl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * 展示修改BeanDefinition
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition myBeanDefinition = beanFactory.getBeanDefinition("myBean");
		RootBeanDefinition rootBeanDefinition = (RootBeanDefinition) myBeanDefinition;
		rootBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
		// 创建一个BeanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Girl.class);
		// 将BeanDefinition注册到容器中
		defaultListableBeanFactory.registerBeanDefinition("girl",beanDefinition);
	}
}
