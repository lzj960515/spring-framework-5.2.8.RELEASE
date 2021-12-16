package com.my.spring.test.cons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 测试构造器推断
 * 	结论：如果有@Autowired(required = true)，使用该构造器
 * 	如果多个@Autowired(required = false)
 * 		1. 参数相同，构造器在前的初始化
 * 		2. 参数不相同，参数更多的初始化
 * 	多个@Autowired(required = true) 报错
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
public class InstanceA {

	public InstanceA(InstanceB instanceB, InstanceC instanceC, InstanceD InstanceD){
		System.out.println("instance B ...");
	}

	@Autowired(required = false)
	public InstanceA(InstanceD InstanceD, InstanceB instanceB){
		System.out.println("instance D ...");
	}

	@Autowired(required = false)
	public InstanceA(InstanceC instanceC){
		System.out.println("instance C ...");
	}





}
