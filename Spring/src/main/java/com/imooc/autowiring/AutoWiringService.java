package com.imooc.autowiring;
/*
 * default-autowire="byType">  和bean的ID是没有关系的
 * default-autowire="byName">  如果id对不上，找不到，不会执行的。 <bean id="autoWiringDAO"
 * default-autowire="constructor">
 */
public class AutoWiringService {
	
	private AutoWiringDAO autoWiringDAO;
	
	//constructor
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("AutoWiringService--->by constructor");
		this.autoWiringDAO = autoWiringDAO;
	}

	//byType
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("setAutoWiringDAO");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
