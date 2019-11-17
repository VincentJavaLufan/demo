package com.imooc.aop.schema.advice.biz;

public class XxxxBiz {
	public void biz() {
		System.out.println("xxxxBiz biz ");
//		throw new RuntimeException();//强制抛出异常
	}
	
	public void init(String bizName,int times) {
		System.out.println("xxxxBiz init:" + bizName + " " + times);
	}
}
