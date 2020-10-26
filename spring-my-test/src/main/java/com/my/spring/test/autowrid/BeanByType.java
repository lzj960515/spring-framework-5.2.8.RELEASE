package com.my.spring.test.autowrid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author Zijian Liao
 * @since
 */
@Component
public class BeanByType {

//	private DependBean dependBean;
//	@Autowired
//	private DependBean dependBean2;
//	@Autowired(required = false)
//	public BeanByType(DependBean depend){
//		System.out.println("1个参数的");
//	}
//
//	@Autowired(required = false)
//	public BeanByType(DependClass depend, DependBean dependBean){
//		System.out.println("2个参数的");
//	}

//	public BeanByType(){};

	@Value("123")
	private String number;

	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}

//	public BeanByType(DependBean dependBean){
//		this.dependBean = dependBean;
//	}

	/*public void setDependBean(DependBean dependBean){
		System.out.println("调用set方法，传入bean: " + dependBean);
	}*/

	/*@Override
	public String toString() {
		return "BeanByType{" +
				"dependBean=" + dependBean +
				'}';
	}*/

//	@Override
//	public String toString() {
//		return "BeanByType{" +
//				"dependBean=" + dependBean1 +
//				", number='" + number + '\'' +
//				'}';
//	}
}
