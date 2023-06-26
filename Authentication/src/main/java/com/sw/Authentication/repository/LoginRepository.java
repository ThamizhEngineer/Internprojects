package com.sw.Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.Authentication.model.login;



@Repository
public interface LoginRepository extends JpaRepository<login,String>{

	public login findByusername(String username);


	public login findByusernameandpassword(String username, String password);
	
}
