package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private Integer id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="pasword")
	private String pasword;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(Integer id, String username, String pasword) {
		super();
		this.id = id;
		this.username = username;
		this.pasword = pasword;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", pasword=" + pasword + "]";
	}


}