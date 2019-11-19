package com.wechat.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class mainTest {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("config.xml"));
		System.out.println("我是IT学习者创建的实例：" + factory.getBean("random").toString());
		
//		XmlBeanFactory factory2 = new XmlBeanFactory(new ClassPathResource("config.xml"));
//		System.out.println(factory2.getBean("dogSpeak").toString());
	}
	
	@Test
	public void test() {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("config.xml"));
		System.out.println(factory.getBean("testDog").toString());
	}
}
