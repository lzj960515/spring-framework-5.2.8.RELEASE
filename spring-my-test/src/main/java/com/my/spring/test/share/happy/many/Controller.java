package com.my.spring.test.share.happy.many;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.lang.annotation.Inherited;
import java.util.List;
import java.util.Map;

/**
 * 演示多依赖注入-controller
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@org.springframework.stereotype.Controller
public class Controller {

//	@Autowired
//	private IService service;

	//-------演示依赖查找-------
	@Autowired
	private List<IService> services;
	@Autowired
	private Map<String,IService> serviceMap;

//	public void printService(){
//		System.out.println(service);
//	}

	public void printServiceList(){
		services.forEach(System.out::println);
	}

	public void printServiceMap(){
		serviceMap.forEach((key,value)->{
			System.out.println(key + ": " + value);
		});

	}

}
