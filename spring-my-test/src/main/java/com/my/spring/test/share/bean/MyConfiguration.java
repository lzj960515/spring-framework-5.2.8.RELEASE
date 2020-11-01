package com.my.spring.test.share.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@ComponentScan(basePackages = {"com.my.spring.test.share.bean","com.my.spring.test.share.event"})
@Import(MyBeanFactoryPostProcessor.class)
@Configuration
public class MyConfiguration {

	@Bean(initMethod = "customInit",destroyMethod = "customDestroy")
	public MyBean myBean(){
		return new MyBean();
	}
}
