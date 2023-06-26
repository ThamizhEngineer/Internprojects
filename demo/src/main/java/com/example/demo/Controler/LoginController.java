package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Login;
import com.example.demo.Model.Userlist;
import com.example.demo.Repository.UserlistRepository;
import com.example.demo.Service.LoginService;


@Controller
@RestController
@RequestMapping("/main/value")

@CrossOrigin


public class LoginController {
	@Autowired
	private LoginService lgservice;
	
	@Autowired
	private UserlistRepository listrepo;
	
	@GetMapping("/get-login/{username}")
	public List<Login> getUserName(@PathVariable String username){
		return lgservice.findByusername(username);
	}
	
	@PostMapping("/post-login")
	public Login login(@RequestBody Login user) {

	String loginUsername = user.getUsername();
	String loginPasword = user.getPasword();
	
	System.out.println(loginUsername);
	System.out.println(loginPasword);
	

	Login userobj = null;
	
	if (loginUsername != null && loginPasword != null) {
	userobj = lgservice.fetchUsernameandPasword(loginUsername,loginPasword);
	}
	System.out.println(userobj);
	
	List<Login> obj=lgservice.findAllrecords();
	if(obj.contains(userobj)) {
		System.out.println("Success");
	}else {
		System.out.println("InvalidLogin");
	}
	System.out.println("userobj");
//	if (userobj != null) {
//	System.out.println("user with " + username + " is alreadty exits");
//	}
	return userobj;
	}
	
	

	@GetMapping("/get-userlist")
	public List<Userlist> getusers(){
		return this.listrepo.findAll();
	}
}