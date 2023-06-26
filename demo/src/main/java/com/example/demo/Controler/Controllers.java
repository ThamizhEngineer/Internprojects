package com.example.demo.Controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Model.Userlist;
import com.example.demo.Repository.UserlistRepository;
import com.example.demo.Service.UserService;



@CrossOrigin
@Controller
@RestController
@RequestMapping("/main")
public class Controllers {
	@Autowired
	UserService userser;
	
	@Autowired
	UserlistRepository userrepo;

	@PostMapping("/get-login")
	
	public String gets(@RequestBody User user ) {
		
		String password =user.getPassWord();
		String username =user.getUserName();
		System.out.println(user);		
		return userser.get(username,password); 
	}
	
	@GetMapping("/get-user")
	List<Userlist> findAll(){
		return userrepo.findAll();
	}

}
