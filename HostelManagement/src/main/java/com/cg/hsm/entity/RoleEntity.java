package com.cg.hsm.entity;

import javax.persistence.Id;

public class RoleEntity{
	public static final int ADMIN = 1;
	public static final int STUDENT = 2;
	public static final int WARDEN = 3;
	
	private long id;
	private String name;
	private String description;

	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static int getAdmin() {
		return ADMIN;
	}
	public static int getStudent() {
		return STUDENT;
	}
	public static int getWarden() {
		return WARDEN;
	}
	


}
