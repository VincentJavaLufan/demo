package com.imooc.aop.api;
/**
 * 后缀通知必须实现 org.springframework.aop.AfterReturningAdvice 接口、
 * 可以访问返回值（但是不能修改），被调用的方法，方法的参数和目标
 * 如果抛出异常，将会抛出拦截器链，替代返回值。
 */
import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MoocThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception ex)  throws Throwable{
		System.out.println("MoocThrwosAdvice afterThrowing 1");
	}
	
	public void afterThrowing(Method method,Object[] args,Object target,Exception ex)  throws Throwable{
		System.out.println("MoocThrwosAdvice afterThrowing 2" + 
				method.getName() + "" + target.getClass().getName());
	}
}
