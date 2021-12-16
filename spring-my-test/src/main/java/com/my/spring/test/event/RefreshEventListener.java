package com.my.spring.test.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 容器启动完毕监听器
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class RefreshEventListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Object source = event.getSource();
		AnnotationConfigApplicationContext context = (AnnotationConfigApplicationContext) source;
		System.out.println("触发监听");
	}
}
