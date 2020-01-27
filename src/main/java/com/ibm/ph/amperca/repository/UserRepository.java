package com.ibm.ph.amperca.repository;

import java.util.List;

import com.ibm.ph.amperca.model.User;

public interface UserRepository {
	
	User getUser(Integer id);
	
	List<User> getUsers();
	
	

}
