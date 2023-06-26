package com.sw.SpringIonicCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sw.SpringIonicCrud.Entity.login;
import com.sw.SpringIonicCrud.Repository.loginRepository;
import com.sw.SpringIonicCrud.Repository.productrepository;

@Service
public class loginservice {
	
	@Autowired
	private productrepository prepo;
	
	@Autowired
	private loginRepository lgrepo;
	
	public String deleteById(Integer productid) {
		String result;
		try {
			prepo.deleteById(productid);
			result="Product Deleted successfully";
		}catch(Exception e) {
			result="Product Not Deleted successfully";
		}
		return result;
	}

	

	public List<login> findAllrecords() {
		// TODO Auto-generated method stub
		return lgrepo.findAll();
	}

	public login fetchusernameandpassword(String username, String password) {
		
		return lgrepo.findAllByUsernameAndPassword(username, password);
	}

	

	
}
