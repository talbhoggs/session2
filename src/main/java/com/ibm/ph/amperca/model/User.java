package com.ibm.ph.amperca.model;

public class User {
	
	private Integer id;
	private String name;
	
	public User() {}
	
	public User(Integer id, String name) {
		this.name = name;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
