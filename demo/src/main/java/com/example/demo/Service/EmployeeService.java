package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employeedata;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.EmployeedataRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeedataRepository emprepo;

	@Autowired
	private EmployeeRepository Erepo;
	
//	public List<Employeedata> insertAddress(List<Employeedata> emplist, Integer empaddressId) {
//	
//		 emprepo.saveAll(emplist);
//		 
//		 return emprepo.findByempaddressId(empaddressId);
//	}


//
//	public List<Employeedata> deleteemp(Integer empdataId) {
//
//		return emprepo.findByempdataId(empdataId);
//	}




	public List<Employeedata> deleteemp(Integer empdataId) {
		Optional<Employeedata> data= emprepo.findById(empdataId);
		System.out.println(data);
		emprepo.deleteById(empdataId);
		return emprepo.findAll();
	}


	public String deleteEmployeeByempId(Integer emp_ID) {
		String results;
		try {
			Erepo.deleteById(emp_ID);
		results="Employee Id Deleted Successfully";

		}catch(Exception e){
		results="Employee Id is not Deleted";

		}
		return results;

	}

	// child table functions
	
	
	public String deleteEmployeeBydataId(Integer empdataId) {
		String results;
		try {
			emprepo.deleteById(empdataId);
		results="Employee AddressId Deleted Successfully";

		}catch(Exception e){
		results="Employee AddressId is not Deleted";

		}
		return results;
	}



}
