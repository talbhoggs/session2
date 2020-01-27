package com.ibm.ph.amperca.service;

import java.util.List;

import com.ibm.ph.amperca.model.User;
import com.ibm.ph.amperca.repository.UserRepository;
import com.ibm.ph.amperca.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	
	private UserRepository userUserRepository;
	
	public UserServiceImpl(UserRepository userUserRepository) {
		this.userUserRepository = userUserRepository;
	}
	
	@Override
	public User getUser(Integer id) {
		return userUserRepository.getUser(id);
	}

	@Override
	public List<User> getUsers() {
		return userUserRepository.getUsers();
	}

}
