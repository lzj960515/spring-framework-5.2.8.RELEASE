package com.my.spring.test.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 普通BeanB
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class NormalBeanB {

	private NormalBeanA normalBeanA;

	public void setNormalBeanA(NormalBeanA normalBeanA) {
		this.normalBeanA = normalBeanA;
	}

	@Override
	public String toString() {
		return "NormalBeanB{" +
				"normalBeanA=" + normalBeanA.hashCode() +
				'}';
	}
}
