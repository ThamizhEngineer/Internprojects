package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Model.Employeedata;

public interface EmployeedataRepository extends JpaRepository<Employeedata,Integer>{

	
	

	List<Employeedata> findByempaddressId(Integer empaddressId);

//	List<Employeedata> findByempdataId(Integer empdataId);

	List<Employeedata> findBycity(String city);

	List<Employeedata> findByempdataId(Integer empdataId);



	

	







	


}
