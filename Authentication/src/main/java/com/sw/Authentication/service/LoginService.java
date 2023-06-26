package com.sw.Authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.Authentication.model.login;
import com.sw.Authentication.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginrepository;
	
	public List<login> findAll() {
		return loginrepository.findAll();
	}
	
	public login save(login Login) {
		return loginrepository.save(Login);
	}

	public login findByname(String username) {
	
		return loginrepository.findByusername(username);
	}



	public login findByusernameandpassword(String username, String password) {
		
		return loginrepository.findByusernameandpassword(username,password);
	}


//
//	public login fetchloginByusernameandpassword(String username, String password) {
//	
//		
//	}



//	public login findByusernameandpassword(String username, String password) {
//		// TODO Auto-generated method stub
//		return loginrepository.findByusernameandpassword(username, password);
//	}
//	
}
