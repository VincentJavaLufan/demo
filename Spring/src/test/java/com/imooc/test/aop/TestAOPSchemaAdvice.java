package com.imooc.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.biz.AspectBiz;
import com.imooc.aop.schema.advice.biz.XxxxBiz;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase{

	public TestAOPSchemaAdvice() {
		super("classpath:spring-aop-schema-advice.xml");
	}
	
	@Test
	public void testAspectBiz() {
		AspectBiz biz = super.getBean("aspectBiz");
		biz.biz();
	}
	
	@Test
	public void testXxxxBiz() {
		XxxxBiz biz = super.getBean("xxxxBiz");
		biz.biz();
	}
	
	@Test
	public void testInit() {
		AspectBiz biz = super.getBean("aspectBiz");
		biz.init("moocService", 3);
	}
	
	@Test
	public void testFit() {	//introductions 只支持单例模式
		Fit fit = super.getBean("aspectBiz");
		fit.filter();
	};
}
