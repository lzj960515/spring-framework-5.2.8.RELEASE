package com.my.spring.test.resource;

import java.io.File;

/**
 * @author Zijian Liao
 * @since
 */
public class MyResource {

	private String basePackage;

	private File file;

	public MyResource(String basePackage, File file) {
		this.basePackage = basePackage;
		this.file = file;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
