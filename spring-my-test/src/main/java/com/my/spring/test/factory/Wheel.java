package com.my.spring.test.factory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 轮胎
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Component
@Lazy
public class Wheel {

	public Wheel(){
		System.out.println("init wheel!");
	}
	@Value("1234")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wheel{" +
				"name='" + name + '\'' +
				'}';
	}

}
