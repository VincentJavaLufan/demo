package com.imooc.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")//默认scope为singleton
//@Component("bean")
@Component
public class BeanAnnotation {
	
	public void say(String arg) {
		System.out.println("BeanAnnotation.say:" + arg);
	}
	
	public void myHashCode() {
		System.out.println("BeanAnnotation.myHashCode:" + this.hashCode());
	}
	
}
