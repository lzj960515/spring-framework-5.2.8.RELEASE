package com.my.spring.test.share.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 展示Bean的生命周期
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class MyBean implements InitializingBean, DisposableBean {

	public MyBean(){
		System.out.println("实例化");
	}

//	@Autowired
//	private MyDepend myDepend;

	public void setMyDepend(MyDepend myDepend) {
		System.out.println("注入了依赖～");
	}

	@PostConstruct
	public void annotationInit(){
		System.out.println("调用「注解」的「初始化」方法");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用「接口」的「初始化」方法");
	}
	public void customInit(){
		System.out.println("调用「自定义」的「初始化」方法");
	}

	@PreDestroy
	public void annotationDestroy(){
		System.out.println("调用「注解」的「销毁」方法");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("调用「接口」的「销毁」方法");
	}
	public void customDestroy(){
		System.out.println("调用「自定义」的「销毁」方法");
	}

}
