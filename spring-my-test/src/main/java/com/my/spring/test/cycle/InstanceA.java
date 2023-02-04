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
//@Lazy
@Component
public class InstanceA {

	@Autowired
	private InstanceB instanceB;
	/*@Autowired
	private InstanceC instanceC;
*/

	public InstanceA(){
//		System.out.println("a init! " + Thread.currentThread().getName());
	}

	public void test(){
		System.out.println("test");
	}

	/*public void run(){
		instanceC.run();
	}*/
}
