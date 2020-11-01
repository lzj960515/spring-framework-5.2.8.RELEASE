package com.my.spring.test.share.happy.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 演示奇怪的知识
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Configuration
public class HappyConfiguration {

	@Bean
	public HappyBean happyBean(){
		return new HappyBean();
	}

	@Bean
	public HappyWrapBean happyWrapBean(){
		return new HappyWrapBean(happyBean());
	}
}
