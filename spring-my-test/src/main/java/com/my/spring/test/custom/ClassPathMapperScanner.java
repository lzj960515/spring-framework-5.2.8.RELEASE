package com.my.spring.test.custom;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
public class ClassPathMapperScanner extends ClassPathBeanDefinitionScanner {


	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface() && beanDefinition.getMetadata().isIndependent();
	}

	public ClassPathMapperScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	public ClassPathMapperScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
		super(registry, useDefaultFilters);
	}

	public ClassPathMapperScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters, Environment environment) {
		super(registry, useDefaultFilters, environment);
	}

	public ClassPathMapperScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters, Environment environment, ResourceLoader resourceLoader) {
		super(registry, useDefaultFilters, environment, resourceLoader);
	}
}
