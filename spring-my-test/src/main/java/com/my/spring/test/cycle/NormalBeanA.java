package com.my.spring.test.cycle;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 普通BeanA
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class NormalBeanA {

	private NormalBeanB normalBeanB;

	public void setNormalBeanB(NormalBeanB normalBeanB) {
		this.normalBeanB = normalBeanB;
	}

	@Override
	public String toString() {
		return "NormalBeanA{" +
				"normalBeanB=" + normalBeanB.hashCode() +
				'}';
	}
}
