package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Employeedata;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

//	List<Employeedata> insertAddress(List<Employeedata> emplist);

	


	
	
}
