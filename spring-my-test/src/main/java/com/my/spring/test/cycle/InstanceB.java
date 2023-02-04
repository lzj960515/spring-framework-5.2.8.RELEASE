package com.my.spring.test.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 测试构造器循环依赖
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class InstanceB {

	@Autowired
	private InstanceA instanceA;
	@Autowired
	private InstanceC instanceC;
/*
	public InstanceB(InstanceA instanceA) {
		this.instanceA = instanceA;
		System.out.println("b init! " + Thread.currentThread().getName());
	}*/

	/*@PostConstruct
	public void init(){
		// 此处测试是否会引发空指针异常
		// 流程，instanceA创建时依赖instanceB,进而触发instanceB的实例化，
		// instanceB实例化时需要instanceA，从早期对象缓存池中取出instanceA，
		// 此时instanceA中的instanceB和instanceC的引用为空
		// 此时再触犯instanceB的初始化方法，调用instanceA的run方法，instanceA的run方法又调用instanceC的run方法
		// 猜测会发生空指针异常
//		instanceA.run();
		// 猜测结果正确
	}*/

}
