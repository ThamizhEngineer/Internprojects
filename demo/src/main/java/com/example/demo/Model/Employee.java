package com.example.demo.Model;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="employeeparents")
public class Employee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="emp_ID")
	private Integer emp_ID;
	
	@Column(name="first_Name")
	private String first_Name;
	
	@Column(name="last_Name")
	private String last_Name;
	
	@Column(name="department")
	private String department;

	@Column(name="gender")
	private String gender;
	
	@Column(name="phone")
	private BigInteger phone;
	
	@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
	@Column(name="dob")
	private Date dob;
	
	//@OneToMany(targetEntity = Employeedetail.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
	@OneToMany(mappedBy = "empaddressId" ,cascade = CascadeType.ALL)
	
	private List<Employeedata> emplist;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer emp_ID, String first_Name, String last_Name, String department, String gender,
			BigInteger phone, Date dob, List<Employeedata> emplist) {
		super();
		this.emp_ID = emp_ID;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.department = department;
		this.gender = gender;
		this.phone = phone;
		this.dob = dob;
		this.emplist = emplist;
	}

	public Integer getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(Integer emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Employeedata> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employeedata> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "Employee [emp_ID=" + emp_ID + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", department=" + department + ", gender=" + gender + ", phone=" + phone + ", dob=" + dob
				+ ", emplist=" + emplist + ", getEmp_ID()=" + getEmp_ID() + ", getFirst_Name()=" + getFirst_Name()
				+ ", getLast_Name()=" + getLast_Name() + ", getDepartment()=" + getDepartment() + ", getGender()="
				+ getGender() + ", getPhone()=" + getPhone() + ", getDob()=" + getDob() + ", getEmplist()="
				+ getEmplist() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}