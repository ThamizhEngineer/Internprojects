package com.sw.Authentication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logincredentials")
public class login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	private String password;
	
	public login() {}
	
	public login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public  String getUsername() {
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

	@Override
	public String toString() {
		return "login [username=" + username + ", password=" + password + "]";
	}


}
