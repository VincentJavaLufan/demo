package com.imooc.ioc.injection.service;

import com.imooc.ioc.injection.dao.InjectionDAO;


public class InjectionServiceImpl implements InjectionService {
	
	private InjectionDAO injectionDAO;

	//设值注入
//	public void setInjectionDAO(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}
	
	//构造器注入
	public InjectionServiceImpl(InjectionDAO injectionDAO1) {
		this.injectionDAO = injectionDAO1;
	}

	public void save(String arg) {
		//模拟业务操作
//		System.out.println("InjectionServiceImpl -- Service接收参数：" + arg);
//		arg = arg + ":" + this.hashCode();
//		injectionDAO.save(arg);
	}
	
}
