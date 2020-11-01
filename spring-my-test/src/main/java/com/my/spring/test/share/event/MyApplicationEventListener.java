package com.my.spring.test.share.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class MyApplicationEventListener {

	@EventListener
	public void onEvent(MyApplicationEvent event){
		System.out.println("接收到事件：" + event.getSource().toString());
	}
}
