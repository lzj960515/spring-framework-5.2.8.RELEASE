package com.my.spring.test.share.factory;

import com.my.spring.test.factory.Wheel;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * 演示只使用BeanFactory
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class OnlyBeanFactory {

	public static void main(String[] args) {
		// 创建一个DefaultListableBeanFactory实例
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 创建一个BeanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Girl.class);
		// 将BeanDefinition注册到容器中
		beanFactory.registerBeanDefinition("girl",beanDefinition);
		Girl girl = beanFactory.getBean("girl", Girl.class);
		System.out.println(girl);
	}
}
