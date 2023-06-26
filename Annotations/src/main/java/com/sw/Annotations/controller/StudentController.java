package com.sw.Annotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	@GetMapping("/studentdatas")
	public String getstudent() {
		return "studentdata";
	}
}
