package com.my.spring.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Zijian Liao
 * @since
 */
@Aspect
@Component
public class ServiceAspect {

	@Pointcut(value = "execution(* com.my.spring.test.aop.*.*(..))")
	public void pointCut() {
	}

	@Before(value = "pointCut()")
	public void methodBefore(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法 【" + methodName + "】 的【前置通知】，入参：" + Arrays.toString(joinPoint.getArgs()));
	}

	@After(value = "pointCut()")
	public void methodAfter(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法 【" + methodName + "】 的【后置通知】，入参：" + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(value = "pointCut()")
	public void methodReturn(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法 【" + methodName + "】 的【返回通知】，入参：" + Arrays.toString(joinPoint.getArgs()));
	}

	@AfterThrowing(value = "pointCut()")
	public void methodThrow(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("执行目标方法 【" + methodName + "】 的【异常通知】，入参：" + Arrays.toString(joinPoint.getArgs()));
	}
}
