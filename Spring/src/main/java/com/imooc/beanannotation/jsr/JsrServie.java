package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

//@Service
@Named
public class JsrServie {
	
//	@Resource
//	@Inject
	private JsrDAO jsrDAO;
	
//	@Resource
	@Inject  //  等效于  autowire，可以使用于类，属性，方法，构造器
	public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("JsrServie init.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JsrServie destroy.");
	}

	public void save() {
		jsrDAO.save();
	}
	
}
