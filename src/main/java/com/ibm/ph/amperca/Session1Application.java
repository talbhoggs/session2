package com.ibm.ph.amperca;

import com.ibm.ph.amperca.controller.UserController;
import com.ibm.ph.amperca.repository.UserRepository;
import com.ibm.ph.amperca.repository.UserRepositoryImpl;
import com.ibm.ph.amperca.service.UserService;
import com.ibm.ph.amperca.service.UserServiceImpl;

public class Session1Application {

	public static void main(String[] args) {
		UserRepository userRepository = new UserRepositoryImpl();
		UserService userService = new UserServiceImpl(userRepository);
		UserController controller = new UserController(userService);
		controller.getUsers().forEach(user -> System.out.println(user.getId() + " " + user.getName()));
	}

}
