package com.my.spring.test.aspectj;

import org.aspectj.weaver.tools.PointcutExpression;
import org.aspectj.weaver.tools.PointcutParser;
import org.aspectj.weaver.tools.ShadowMatch;

import java.lang.reflect.Method;

/**
 * aop工具
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class AOPUtils {
	// AspectJ的固定写法，获取一个切点解析器
	static PointcutParser parser = PointcutParser
			.getPointcutParserSupportingSpecifiedPrimitivesAndUsingSpecifiedClassLoaderForResolution(
					PointcutParser.getAllSupportedPointcutPrimitives(), ClassLoader.getSystemClassLoader());
	// 切点表达式
	private static PointcutExpression pointcutExpression;

	/**
	 * 初始化工具类，我们需要先获取一个切点表达式
	 *
	 * @param expression 表达式
	 */
	public static void init(String expression){
		// 解析出一个切点表达式
		pointcutExpression =  parser.parsePointcutExpression(expression);
	}

	/**
	 * 第一次筛选，根据类筛选，也叫做粗筛
	 *
	 * @param targetClass 目标类
	 * @return 是否匹配
	 */
	public static boolean firstMatch(Class<?> targetClass){
		return pointcutExpression.couldMatchJoinPointsInType(targetClass);
	}

	/**
	 * 第二次筛选，根据方法筛选，也叫做精筛，精筛通过则说明完全匹配
	 * ps: 也可以使用该方法进行精筛，粗筛的目的是提高性能，第一次直接过滤掉不合适的类再慢慢精筛
	 *
	 * @param method 方法
	 * @return 是否匹配
	 */
	public static boolean lastMatch(Method method){
		ShadowMatch shadowMatch = pointcutExpression.matchesMethodExecution(method);
		return shadowMatch.alwaysMatches();
	}

}
