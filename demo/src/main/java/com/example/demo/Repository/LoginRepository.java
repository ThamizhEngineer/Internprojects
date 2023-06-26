package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Login;

public interface LoginRepository  extends JpaRepository<Login,Integer>{

	List<Login> findByusername(String username);


	Login findByUsernameAndPasword(String username, String pasword);

	

}
