package com.my.spring.test.cons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 测试构造器推断
 * 	结论：
 * 	如果都没有加@Autowired注解，且有多个构造器，使用空构造器，如果没有空构造器，报错
 * 	如果都没有加@Autowired注解，但只有一个构造器，使用该构造器
 * 	如果有加了@Autowire注解的构造器，使用加了@Autowired注解的构造器
 * 	如果有@Autowired(required = true)，使用该构造器
 * 	如果多个@Autowired(required = false)
 * 		1. 参数相同，构造器在前的初始化
 * 		2. 参数不相同，参数更多的初始化
 * 		3. 如果参数更多的初始化不成功，则按顺序往下执行，直有个构造器成功，如果都没成功，则抛出异常
 * 	多个@Autowired(required = true) 报错
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class InstanceA {

	@Autowired(required = false)
	public InstanceA(InstanceB instanceB){
		System.out.println("instance B ...");
	}

	@Autowired(required = false)
	public InstanceA(InstanceC instanceC){
		System.out.println("instance C ...");
	}

	@Autowired(required = false)
	public InstanceA(InstanceB instanceB, InstanceC instanceC, InstanceD InstanceD){
		System.out.println("instance B C D...");
	}

}
