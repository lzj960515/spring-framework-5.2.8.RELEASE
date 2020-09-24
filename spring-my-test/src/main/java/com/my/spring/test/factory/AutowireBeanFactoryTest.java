package com.my.spring.test.factory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * 自动装配bean工厂测试
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class AutowireBeanFactoryTest {
	public static void main(String[] args) {
		//创建一个DefaultListableBeanFactory实例
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		//创建一个BeanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Wheel.class);
		//将BeanDefinition注册到容器中
		beanFactory.registerBeanDefinition("wheel",beanDefinition);
		Wheel wheel = beanFactory.getBean("wheel", Wheel.class);
		System.out.println(wheel);
	}
}
