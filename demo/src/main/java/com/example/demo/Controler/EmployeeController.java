package com.example.demo.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.Employee;
import com.example.demo.Model.Employeedata;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.EmployeedataRepository;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/main/value")

@CrossOrigin
public class EmployeeController {
	@Autowired 
	private EmployeeRepository emprepo;
	
	@Autowired 
	private EmployeedataRepository empdatarepo;
	
	@Autowired
	private EmployeeService service;
	
	//get data using parent &child
	@GetMapping("/employee")
	public List<Employee> findAll(){
		return emprepo.findAll();
	}
	
	//get data by employeebyid
	@GetMapping("/employee/{emp_ID}")
	public Optional<Employee> getdataById(@PathVariable Integer emp_ID) {
		return emprepo.findById(emp_ID);
	}
	
	
	//Insert using parent table
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return emprepo.save(employee);
	}

	
	//update in parent table 
	
	@PutMapping("/employee/{emp_ID}")
		public ResponseEntity <Employee> updateemp(@PathVariable Integer emp_ID,@RequestBody Employee employeedetails){
			Employee employee=emprepo.findById(emp_ID)
					.orElseThrow(() ->new ResourceNotFoundException("Employee not exist:"+emp_ID));
			employee.setFirst_Name(employeedetails.getFirst_Name());
			employee.setLast_Name(employeedetails.getLast_Name());
			employee.setDepartment(employeedetails.getDepartment());
			employee.setGender(employeedetails.getGender());
			employee.setPhone(employeedetails.getPhone());
		//	employee.setDateofBirth(employeedetails.getDateofBirth());
			Employee updateemp= emprepo.save(employee);
			
			return ResponseEntity.ok(updateemp);
			
		}
	//delete tables using parent

			@DeleteMapping("/employee/{emp_ID}")
			public String deleteRecord(@PathVariable Integer emp_ID) {
				return service.deleteEmployeeByempId(emp_ID);
			}	
			
	//	*/Child table fn*/
	
			@GetMapping("/employeechild")
			public List<Employeedata> findAlldata(){
				return empdatarepo.findAll();
			}
			
		//Get databyId from child
			@GetMapping("/employeechild/{empaddressId}")                                                                                                                     
			public Optional<Employeedata> getdataByAddress(@PathVariable Integer empaddressId){
				return empdatarepo.findById(empaddressId);
			}
			
		//Insert in child table 
			
			@PostMapping("/employeechild/{empaddressId}")
			public List<Employeedata> insertadd(@RequestBody List<Employeedata> emplist,@PathVariable Integer empaddressId){
			 empdatarepo.saveAll(emplist);
			 return empdatarepo.findByempaddressId(empaddressId);
			}
		
		//update in Child table 
				@PutMapping("/employeechild/{empaddressId}")
				public ResponseEntity<Employeedata> updateempchild(@PathVariable Integer empaddressId,@RequestBody Employeedata empaddress){
					Employeedata employee=empdatarepo.findById(empaddressId)
							.orElseThrow(() ->new ResourceNotFoundException("Employee not exist:"+empaddressId));
					employee.setCity(empaddress.getCity());
					employee.setDistrict(empaddress.getDistrict());
					employee.setEmpaddressId(empaddress.getEmpaddressId());
					
					Employeedata updateempchild= empdatarepo.save(employee);
					
					return ResponseEntity.ok(updateempchild);
					
				}
				
				
		@DeleteMapping("/employeechild/{empdataId}")
		public String deleteempRecord(@PathVariable Integer empdataId) {
			return service.deleteEmployeeBydataId(empdataId);
		}

		
	
}
