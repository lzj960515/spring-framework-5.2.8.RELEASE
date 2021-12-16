package com.my.spring.test.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
@Configuration
public class FooConfig {

	@Bean
	public Foo foo(){
		return new Foo(bar());
	}

	@Bean
	public Bar bar(){
		return new Bar();
	}
}
