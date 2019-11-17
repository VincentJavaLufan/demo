package com.imooc.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MoocMethodInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("MoocMethodInterceptor:"+invocation.getMethod().getName()+" "
				+invocation.getStaticPart().getClass().getName());
		Object object = invocation.proceed();
		System.out.println("MoocMethodInterceptor 2:" + object);
		return object;
	}

}
