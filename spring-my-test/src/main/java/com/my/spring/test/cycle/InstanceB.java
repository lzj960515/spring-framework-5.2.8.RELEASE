package com.my.spring.test.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 测试构造器循环依赖
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class InstanceB {

	private final InstanceA instanceA;

	public InstanceB(InstanceA instanceA) {
		this.instanceA = instanceA;
		System.out.println("b init! " + Thread.currentThread().getName());
	}

	public void test(){

	}

}
