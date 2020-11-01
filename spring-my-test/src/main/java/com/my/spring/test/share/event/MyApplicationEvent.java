package com.my.spring.test.share.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 展示事件
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class MyApplicationEvent extends ApplicationEvent {

	public String event;

	public MyApplicationEvent(Object source) {
		super(source);
		this.event = (String) source;
	}
}
