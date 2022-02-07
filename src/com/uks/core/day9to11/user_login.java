package com.uks.core.day9to11;

public class user_login {
	String userId;
	String userName;
	String password;
	String userRole;
	String address;
	String city;
	double salary;
	String telnumber;

	public user_login(String userId, String userName, String userRole) {
		this.userId = userId;
		this.userName = userName;
		this.userRole = userRole;
	}

	public user_login(String address, String city, double salary, String telnumber) {
		this.address = address;
		this.city = city;
		this.salary = salary;
		this.telnumber= telnumber;

	}

}
