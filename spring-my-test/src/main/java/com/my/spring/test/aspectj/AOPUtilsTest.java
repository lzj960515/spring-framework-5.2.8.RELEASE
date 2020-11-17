package com.my.spring.test.aspectj;

import com.my.spring.test.aop.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;

/**
 * 测试AOP工具
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class AOPUtilsTest {

	public static void main(String[] args) throws NoSuchMethodException {
		// 定义表达式
		String expression = "execution(* com.my.spring.test.aop.*.matchMethod(..))";
		// 初始化工具类
		AOPUtils.init(expression);
		// 粗筛
		boolean firstMatch = AOPUtils.firstMatch(ServiceImpl.class);
		if(firstMatch){
			System.out.println("第一次筛选通过");
			// 正常情况应该是获取所有方法进行遍历，我这里偷懒了～
			Method doService = ServiceImpl.class.getDeclaredMethod("doService");
			// 精筛
			boolean lastMatch = AOPUtils.lastMatch(doService);
			if(lastMatch){
				System.out.println("第二次筛选通过");
			}
			else{
				System.out.println("第二次筛选未通过");
			}
		}
		else {
			System.out.println("第一次筛选未通过");
		}
	}
}
