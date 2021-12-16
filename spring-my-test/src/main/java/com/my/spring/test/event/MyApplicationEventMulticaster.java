package com.my.spring.test.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 自定义事件多播器
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component("applicationEventMulticaster")
public class MyApplicationEventMulticaster extends SimpleApplicationEventMulticaster {

	private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS,
			new SynchronousQueue<>(), new ThreadFactory() {
		private final AtomicInteger atomicInteger = new AtomicInteger();

		@Override
		public Thread newThread(@NonNull Runnable r) {
			Thread t = new Thread(r, "my-event-pool-thread-"+ atomicInteger.getAndIncrement());
			// 由于该线程用于处理事件类型，当程序停止时，该线程也应当随之停止
			// 将线程设置为守护线程
			t.setDaemon(true);
			return t;
		}
	});

	@Override
	protected Executor getTaskExecutor() {
		return executor;
	}
}
