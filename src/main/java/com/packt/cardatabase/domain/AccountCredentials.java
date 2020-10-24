package com.packt.cardatabase.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//unrecognized field not marked as ignorable
//@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountCredentials {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}