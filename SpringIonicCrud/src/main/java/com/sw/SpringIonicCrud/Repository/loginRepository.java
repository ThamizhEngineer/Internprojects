package com.sw.SpringIonicCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.SpringIonicCrud.Entity.login;

public interface loginRepository extends JpaRepository<login,Integer>{

	login findAllByUsernameAndPassword(String username, String password);

	 

}
