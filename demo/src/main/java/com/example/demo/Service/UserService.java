package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository user;
	

	
	
	public String get(String username,String password) {
		List<User> uname = user.findByUserName(username);
		String getdata = uname.toString();
		
		if(getdata.contains(password) && (getdata.contains(username))) {
			List<String> list = Arrays.asList(username,password);
			String resdata =list.toString();	
			return resdata;
		
		}
		return "invalid Login";
		
	}
	
	
}
