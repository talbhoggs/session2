package com.ibm.ph.amperca.controller;

import java.util.List;

import com.ibm.ph.amperca.model.User;
import com.ibm.ph.amperca.service.UserService;
import com.ibm.ph.amperca.service.UserServiceImpl;

public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	public User getUser(Integer id) {
		return userService.getUser(id);
		
	}
	
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
