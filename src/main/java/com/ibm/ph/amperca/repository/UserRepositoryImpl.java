package com.ibm.ph.amperca.repository;

import java.util.ArrayList;
import java.util.List;

import com.ibm.ph.amperca.model.User;

public class UserRepositoryImpl implements UserRepository {
	
	private List<User> users = new ArrayList<>();
	
	public UserRepositoryImpl() {
		this.users.add(new User(1, "Charles Amper"));
		this.users.add(new User(2, "Louie John Canuel"));
		this.users.add(new User(3, "Lawrence Namoc"));
	}

	public User getUser(Integer id) {
		for(User user: users) {
			if(user.getId() == id ) {
				return user;
			}
		}
		return null;
	}

	public List<User> getUsers() {
		return users;
	}

}
