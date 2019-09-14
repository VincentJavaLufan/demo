package com.sf.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sf.spring.dao.UserDao;

@Component("userService")
public class UserService {
	private UserDao userDao;
	
	//通过构造器把userDao注入
//	public UserService(UserDao userDao) {
//		this.userDao = userDao;
//		System.out.println("userDao" + userDao);//看看有没有拿到userDao
//	}
	
	//set方式注入
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//		System.out.println("userDao:" + userDao);//看看有没有拿到userDao
//	}
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
    public void save() {
        userDao.save();
    }
}
