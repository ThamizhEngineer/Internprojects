package com.sw.SpringIonicCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sw.SpringIonicCrud.Entity.login;
import com.sw.SpringIonicCrud.Repository.loginRepository;
import com.sw.SpringIonicCrud.Service.loginservice;



@Controller
@RestController
@RequestMapping("/main/value")
public class logincontroller {
	@Autowired
	private loginservice service;
	
	@Autowired
	private loginRepository repo;
	
	@Autowired
	private loginservice lgservice;
	
	@GetMapping("/login")
	public List<login> getlogin(){
		return this.repo.findAll();
	}
	@PostMapping("/login/insert")
	public login createlogin(@RequestBody login loginval) {
		return repo.save(loginval);
	}
	
	@PostMapping("/login")
	public login logind(@RequestBody login user) {

	String loginusername = user.getUsername();
	String loginpassword = user.getPassword();
	
	System.out.println(loginusername);
	System.out.println(loginpassword);
	
	login userobj = null;
	
	if (loginusername != null && loginpassword != null) {
	userobj = lgservice.fetchusernameandpassword(loginusername,loginpassword);
	}
	System.out.println(userobj);
	
	List<login> obj=lgservice.findAllrecords();
	if(obj.contains(userobj)) {
		System.out.println("Success");
	}else {
		System.out.println("InvalidLogin");
	}
	System.out.println("userobj");

	return userobj;
	
	}
	
	
}
