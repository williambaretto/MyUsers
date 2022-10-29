package com.example.demo.users.models;

public class CreateUserRequest {
	
	private String firstName;
	private String lastName;
	private String paswword;
	private String email;
	
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
	public String getPaswword() {
		return paswword;
	}
	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
