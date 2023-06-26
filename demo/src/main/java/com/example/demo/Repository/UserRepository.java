package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer> {
	List<User> findByPassWord(String passWord);
	List<User> findByUserName(String userName);
	

}
