package com.sw.JPArelations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.JPArelations.repository.SubjectRepository;
import com.sw.JPArelations.model.College;
import com.sw.JPArelations.model.Student;
import com.sw.JPArelations.model.Subject;
import com.sw.JPArelations.repository.CollegeRepository;
import com.sw.JPArelations.repository.StudentRepository;

@Service
public class UserService {
	@Autowired
	public SubjectRepository subjectRepository;
	
	@Autowired
	public StudentRepository studentRepository;
	
	@Autowired
	public CollegeRepository collegeRepository;
	
	public Iterable<Student> fetchAllRecords() {
		
		return studentRepository.findAll();
	}
	
	public Iterable<Student> fetchAllsRecords() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	public Iterable<Subject> fetchAllsRecord() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}
	
	public Student createstudent(String name) {
		return studentRepository.save(name);
	}
	
	public Subject createsubject(Subject subject) {
		return subjectRepository.save(subject);
	}
	public College crtclg(College college) {
		return collegeRepository.save(college);
	}

	

	public Optional<Student> findstudentId(Integer studentId) {
		
		return studentRepository.findById(studentId);
	}

	public List<College> findsimilarclg(String place) {

	return collegeRepository.findByPlace(place);
	}

	public List<Student> findstudentname(String name) {
	
		return studentRepository.findByName(name);
	}

	public List<Student> findstudentemail(String email) {
		
		return studentRepository.findByemail(email);
	}
//	public List<College>crtclg(List<College> college,Integer CId){
//		collegeRepository.saveAll(college);
//		return collegeRepository.findByCId(CId);
//	}

	public List<College> createclg(List<College> college, Integer CId) {
		collegeRepository.saveAll(college);
		return collegeRepository.findByCId(CId);
	}
	


}
