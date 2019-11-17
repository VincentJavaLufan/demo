package com.imooc.aop.schema.advice.biz;
/**
 * 要实现的业务类
 * @author Administrator
 *
 */
public class AspectBiz {
	public void biz() {
		System.out.println("AspectBiz biz ");
//		throw new RuntimeException();//强制抛出异常
	}
	
	public void init(String bizName,int times) {
		System.out.println("AspectBiz init:" + bizName + " " + times);
	}
	
}
