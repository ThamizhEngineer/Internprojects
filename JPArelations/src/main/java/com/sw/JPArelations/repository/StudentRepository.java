package com.sw.JPArelations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.sw.JPArelations.model.Student;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByName(String name);

	List<Student> findByemail(String email);

	Student save(String name);

	

}
