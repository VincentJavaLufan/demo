package com.imooc.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.beanannotation.injection.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {
	
	@Autowired//用于成员变量
	private InjectionDAO injectionDAO;
	
	@Autowired//构造器注入
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	@Autowired//setter，getter方法
//	public void setInjectionDAO(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}

	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
}
