package com.sw.JPArelations.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.sw.JPArelations.model.College;
import com.sw.JPArelations.model.Student;

@Repository
@EnableJpaRepositories
public interface CollegeRepository extends JpaRepository<College,Integer> {
//
//	Optional<College> findAll(String clgname);

//	Optional<College> findOne(String place);

//	Optional<College> findByClg(String clgname);


List<College> findByPlace(String place);

List<College> findByCId(Integer cId);
}
