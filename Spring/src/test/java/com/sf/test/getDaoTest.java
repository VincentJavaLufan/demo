package com.sf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.test.base.UnitTestBase;
import com.sf.spring.service.UserService;

//@RunWith(BlockJUnit4ClassRunner.class)
public class getDaoTest extends UnitTestBase{

	private ApplicationContext ac;

	//构造器注入配置文件
	public getDaoTest() {
		super("classpath:applicationContext.xml");
	}
	
	@Test
	public void test() {
	    ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	    //得到service对象
	    UserService userService = (UserService) ac.getBean("serService");
	}
	
	@Test
	public void test2() {
		//得到service对象
	    UserService userService = super.getBean("userService");//构造器方式注入
//	    userService.save();
	}
}
 