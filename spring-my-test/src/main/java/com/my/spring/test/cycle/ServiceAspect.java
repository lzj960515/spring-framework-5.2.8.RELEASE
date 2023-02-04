package com.my.spring.test.cycle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Zijian Liao
 * @since
 */
@Aspect
@Component
public class ServiceAspect {

	@Pointcut(value = "execution(* com.my.spring.test.cycle.InstanceA.*(..))")
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
