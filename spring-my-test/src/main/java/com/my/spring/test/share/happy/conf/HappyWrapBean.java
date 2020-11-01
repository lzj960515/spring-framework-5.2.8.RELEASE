package com.my.spring.test.share.happy.conf;

/**
 * 封装 happy bean
 *
 * @author Zijian Liao
 * @since
 */
public class HappyWrapBean {

	private final HappyBean happyBean;

	public HappyWrapBean(HappyBean happyBean) {
		this.happyBean = happyBean;
	}

	public void printBean(){
		System.out.println(happyBean);
	}
}
