package com.ojas;

public class User {
	private int uid;
	private String firstName;
	private String lastName;
	private String email;
	private long mobile_Number;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile_Number() {
		return mobile_Number;
	}

	public void setMobile_Number(long mobile_Number) {
		this.mobile_Number = mobile_Number;
	}

}