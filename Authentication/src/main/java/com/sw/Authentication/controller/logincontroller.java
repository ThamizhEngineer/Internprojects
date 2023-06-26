package com.sw.Authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sw.Authentication.model.login;

import com.sw.Authentication.service.LoginService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/user")
public class logincontroller {
	
	@Autowired
	LoginService loginservice;
	
	
	login Login;
	
	@GetMapping("/get-login")
	public List<login> getlogin(){
		return loginservice.findAll();
	}
	

	@PostMapping("/get-register")
	public login registeruser(@RequestBody login Logins) throws Exception {
		String tempusername= Login.getUsername();
		System.out.println(tempusername);
			if(tempusername!=null && !"".equals(tempusername)){
				login lg=loginservice.findByname(tempusername);
				if(lg != null) {
					throw new Exception("Login with "+tempusername+" is already exists");
				}
			}
				login lg = null;
				lg =loginservice.save(Login);
		return lg;
	}


	@PostMapping("/log-details")
	public login registerlogin(@RequestBody login Logins) throws Exception{
		String username= Login.getUsername();
		String password = Login.getPassword();
		login lg = null;
			if(username!=null && password!=null){
				lg = loginservice.findByusernameandpassword(username,password);
			}
	
			if(lg ==null){
					throw new Exception("Bad Credentials");
			}
			return lg;
	}
	}

//System.out.println(tempusername);	

//if(Logins.equals(getlogin())) {
//System.out.println(Logins);
//
//}
//return Login;
//}

