package com.rahul;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	@Pattern
	(regexp="[^0-9]*")
	private String username;
	
	// used for checking ERRORS
	@Size
	(min=3, max=20)
	private Long password;
	private String email = "rahul@oho.com";
	
	// GETTERS & SETTERS
	public String getUsername() {
		return username;}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Long getPassword() {
		return password;}
	public void setPassword(Long password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;}
	public void setEmail(String email) {
		this.email = email;}
}
