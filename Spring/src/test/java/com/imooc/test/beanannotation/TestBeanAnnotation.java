package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.BeanAnnotation;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	
	public TestBeanAnnotation() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void testSay() {
		BeanAnnotation bean = super.getBean("beanAnnotation");//如果没有定义bean的id 则系统自动起名  @Component
		bean.say("This is test.");
		
//		BeanAnnotation bean = super.getBean("bean");//自定义bean的id   @Component("bean")
//		bean.say("This is test.");
	}
	
	@Test
	public void testScpoe() {
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();
		//scope是prototype条件下两次的值是不一样的
		//scope是singleton或者不写得条件下两次的值是一样的
		bean = super.getBean("beanAnnotation");
		bean.myHashCode();
	}
	
}
