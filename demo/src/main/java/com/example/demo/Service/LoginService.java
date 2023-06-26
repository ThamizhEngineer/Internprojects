package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Login;
import com.example.demo.Repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository lgrepo;

	public List<Login> findByusername(String username) {
	
		return lgrepo.findByusername(username);
	}

	public Login fetchUsernameandPasword(String username, String pasword) {
		
		return lgrepo.findByUsernameAndPasword(username,pasword);
	}

	public List<Login> findAllrecords() {
		
		return lgrepo.findAll();
	}

}
