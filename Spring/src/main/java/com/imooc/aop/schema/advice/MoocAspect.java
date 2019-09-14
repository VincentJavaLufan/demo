package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 指定的切面类
 * @author Administrator
 *
 */
public class MoocAspect {
	public void before() {
		System.out.println("MoocAspect before");
	}
	
	public void afterReturning() {
		System.out.println("MoocAspect afterReturning");
	}
	
	public void afterThrowing() {
		System.out.println("MoocAspect afterThrowing");
	}
	
	public void after() {	//方法结束之前最后一行执行	无论方法是否正常执行结束，这个after方法一定会执行。
		System.out.println("MoocAspect after");
	}
	
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("MoocAspect around 1");
			obj = pjp.proceed();
			System.out.println("MoocAspect around 2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times) {
		System.out.println(bizName + " " + times);
		Object obj = null;
		try {
			System.out.println("MoocAspect aroundInit 1");
			obj = pjp.proceed();
			System.out.println("MoocAspect aroundInit 2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
