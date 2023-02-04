package com.my.spring.test.custom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class MapperScannerProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		final ClassPathMapperScanner classPathMapperScanner = new ClassPathMapperScanner(registry, false);
		// 添加filter，class添加了Mapper注解才注册到Spring中
		classPathMapperScanner.addIncludeFilter(new AnnotationTypeFilter(Mapper.class));
		classPathMapperScanner.scan("com.my.spring.test.custom");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
