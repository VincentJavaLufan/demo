package com.imooc.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


public class MoocResource implements ApplicationContextAware  {
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
		Resource resource = applicationContext.getResource("config.txt");//如果文件名前面什么都不写，就默认使用TestResource的加载方式
//		Resource resource = applicationContext.getResource("classpath:config.txt");
//		Resource resource = applicationContext.getResource("file:C:\\Users\\Administrator\\git\\demo\\Spring\\src\\main\\resources\\config.xml");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
