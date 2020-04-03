package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * 2种方法
 * @author Administrator
 *
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean {
//public class BeanLifeCycle {
	
	//default-init-method="defaultInit" default-destroy-method="defaultDestroy">
	public void defaultInit() {
		System.out.println("Bean defautInit.");
	}
	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy.");
	}

	//public class BeanLifeCycle implements InitializingBean, DisposableBean {
	@Override
	public void destroy() throws Exception {
		System.out.println("@Override Bean destroy.");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("@Override Bean afterPropertiesSet.");
	}

	
	public void start() {
		System.out.println("Bean start .");
	}
	public void stop() {
		System.out.println("Bean stop.");
	}
	
}
