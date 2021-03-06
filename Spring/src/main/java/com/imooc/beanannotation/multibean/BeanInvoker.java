package com.imooc.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {
	
	@Autowired
	private List<BeanInterface> list;
	
	@Autowired
	private Map<String, BeanInterface> map;// @Order(2) 只针对list有效，对map无效。
	
	@Autowired
	@Qualifier("beanImplOne")//beanImpl对于两个实现类，使用quailfier可以缩小范围。指定。。。
	private BeanInterface beanInterface;
	
	public void say() {
		
//		if (null != list && 0 != list.size()) {
//			System.out.println("list...");
//			for (BeanInterface bean : list) {
//				System.out.println(bean.getClass().getName());
//			}
//		} else {
//			System.out.println("List<BeanInterface> list is null !!!!!!!!!!");
//		}
//		System.out.println();
//		
//		if (null != map && 0 != map.size()) {
//			System.out.println("map...");
//			for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
//				System.out.println(entry.getKey() + "	" + entry.getValue().getClass().getName());
//			}
//		} else {
//			System.out.println("Map<String, BeanInterface> map is null !!!!!!!!!!");
//		}
//		System.out.println();
		
		if (null != beanInterface) {
			System.out.println(beanInterface.getClass().getName());
		} else {
			System.out.println("beanInterface is null...");
		}
	}
}
