package com.sw.JPArelations.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.JPArelations.service.UserService;
import	com.sw.JPArelations.model.Subject;
import com.sw.JPArelations.model.College;
import com.sw.JPArelations.model.Student;

@RestController
@RequestMapping("/main")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}
	
	@GetMapping("/base")
	public Iterable<Student> fecthAll() {
	return userService.fetchAllRecords();
	}
	
	@GetMapping("/base-subject")
	public Iterable<Subject> fecthAlls() {
	return userService.fetchAllsRecord();
	}
	
	
	@GetMapping("/getid/{studentId}")
	public Optional<Student> fetchstudentId(@PathVariable Integer studentId) {
	return userService.findstudentId(studentId);
	}
	//student table related datas
	@GetMapping("/getsimilarname/{name}")
	public List<Student> fetchsimilarname(@PathVariable String name){
		return userService.findstudentname(name);
	}
	@GetMapping("/getsimilarmail/{email}")
	public List<Student>fetchsimilaremail(@PathVariable String email){
		return userService.findstudentemail(email);
	}
	@PostMapping("/add-clg")
	public List<College> poststudent(@RequestBody List<College> college, @PathVariable Integer CId) {
		return userService.createclg(college,CId);
	}
	
	//clg related table datas
	@GetMapping("/clg-place/{place}")
	public List<College> fetchplacedetails(@PathVariable String place){
		return userService.findsimilarclg(place);
	}

//	@PostMapping("/clguser")
//	public College createclg(@RequestBody College college) {
//		return userService.crtclg(college);
//	}
	
	}

