package com.my.spring.test.resource;

import com.my.spring.test.aop.IService;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Zijian Liao
 * @since
 */
public class ResourceTest {
	public static void main(String[] args) throws IOException, URISyntaxException, ClassNotFoundException {
		/*String name = IService.class.getName();
		System.out.println(name);
		int i = name.lastIndexOf(".");
		String basePackage = name.substring(0, i);
		basePackage = basePackage.replace(".", "/");
		System.out.println(basePackage);*/

		for (Class<?> aClass : scanClasses("com/my/spring/test")) {
			System.out.println(aClass.getName());
		}
	}

	public static Set<Class<?>> scanClasses(String basePackage) throws IOException, URISyntaxException, ClassNotFoundException {
		Set<MyResource> myResources = scanPackages(basePackage);
		Set<Class<?>> classSet = new HashSet<>(myResources.size());
		for (MyResource myResource : myResources) {
			String classPath =  myResource.getBasePackage()+"/" + myResource.getFile().getName();
			String className = classPath.replaceAll("/",".");
			className = className.substring(0, className.lastIndexOf(".class"));
			classSet.add(Class.forName(className));
		}
		return classSet;
	}

	public static Set<MyResource> scanPackages(String basePackage) throws URISyntaxException, IOException {
		Set<MyResource> result = new HashSet<>();
		Enumeration<URL> resources = ClassLoader.getSystemResources(basePackage);

		while (resources.hasMoreElements()) {
			URL url = resources.nextElement();
			File file = new File(new URI(url.toString()).getSchemeSpecificPart());
			if(file.isDirectory()){
				File[] files = file.listFiles();
				if(files == null || files.length==0){
					continue;
				}
				for (File tempFile : files) {
					if(tempFile.isDirectory()){
						// 继续扫描
						result.addAll(scanPackages(basePackage + "/" + tempFile.getName()));
					}else{
						result.add(new MyResource(basePackage, tempFile));
					}
				}
			}
		}
		return result;
	}
}
