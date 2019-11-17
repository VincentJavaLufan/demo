package com.sf.spring.Action;

import com.sf.spring.service.UserService;

public class UserAction {
	private UserService userService;
	
	public String execute() {
	    userService.save();
	    return null;
	}
}
