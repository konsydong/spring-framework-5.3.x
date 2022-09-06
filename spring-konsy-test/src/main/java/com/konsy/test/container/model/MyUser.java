package com.konsy.test.container.model;

/**
 * @author : konsy
 * @date : 2022-08-03 23:27
 **/
public class MyUser {
	private String username;

	private String password;

	public MyUser() {
	}
	public MyUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
