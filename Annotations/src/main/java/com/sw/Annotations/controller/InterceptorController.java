package com.sw.Annotations.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class InterceptorController {
	
	@GetMapping("/Print-text")
	public String getText() {
		return "Spring Boot";
	}
	@GetMapping("/productlist")
	public List<String> getlist(){
		final List<String> productlist= new ArrayList();
		productlist.add("Laptop");
		productlist.add("MobilePhone");
		productlist.add("HeadPhones");
		productlist.add("ipod");
		productlist.add("tab");
		
		return productlist;
	}
	@GetMapping("/getusers")
	public List<String> getUsers(){
		final List<String> users=new ArrayList();
		users.add("Thamizh");
		users.add("Ilakkiya");
		users.add("Selva");
		users.add("Nilesh");
		users.add("Manivel");
		
		return users;
	}
	
	@GetMapping("/studentdatas")
	public String getstudent() {
		return "studentdata";
	}
}
