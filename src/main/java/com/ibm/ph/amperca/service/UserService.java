package com.ibm.ph.amperca.service;

import java.util.List;

import com.ibm.ph.amperca.model.User;

public interface UserService {
	User getUser(Integer id);
	
	List<User> getUsers();

}
