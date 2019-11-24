package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocApplicationContext11 implements ApplicationContextAware  {
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("MoocApplicationContext11.setApplicationContext:" + applicationContext.getBean("moocApplicationContext11").hashCode());
	}
}
