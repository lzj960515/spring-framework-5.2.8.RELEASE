package com.my.spring.test.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Zijian Liao
 * @since 1.0.0
 */
public class Test {

	public static void main(String[] args) {
//		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, System.getProperty("user.dir"));

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(FooConfig.class);
		enhancer.setCallback((MethodInterceptor) (obj, method, args1, methodProxy) -> {
			System.out.println("cglib proxy!");
			return methodProxy.invokeSuper(obj, args1);
		});
		final FooConfig fooConfig = (FooConfig) enhancer.create();
		fooConfig.bar();
	}
}
