package com.sw.JPArelations.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


import com.sw.JPArelations.model.Subject;

@Repository
@EnableJpaRepositories
public interface SubjectRepository extends JpaRepository<Subject,Integer> {

	

	


}
