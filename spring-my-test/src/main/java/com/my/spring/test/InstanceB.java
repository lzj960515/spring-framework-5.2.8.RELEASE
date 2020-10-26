package com.my.spring.test;

/**
 * @author Zijian Liao
 * @since
 */
public class InstanceB {

	private InstanceA instanceA;

	public void setInstanceA(InstanceA instanceA) {
		this.instanceA = instanceA;
	}

	@Override
	public String toString() {
		return "InstanceB{" +
				"instanceA=" + instanceA.hashCode() +
				'}';
	}
}
