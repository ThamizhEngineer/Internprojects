package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeechilds")
public class Employeedata {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="empdata_id")
	private Integer empdataId;
	
	@Column(name="city")
	private String city;
	
	@Column(name="district")
	private String district;
	
	@Column(name="empaddress_id")
	private Integer empaddressId;

	public Employeedata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employeedata(Integer empdataId, String city, String district, Integer empaddressId) {
		super();
		this.empdataId = empdataId;
		this.city = city;
		this.district = district;
		this.empaddressId = empaddressId;
	}

	public Integer getEmpdataId() {
		return empdataId;
	}

	public void setEmpdataId(Integer empdataId) {
		this.empdataId = empdataId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getEmpaddressId() {
		return empaddressId;
	}

	public void setEmpaddressId(Integer empaddressId) {
		this.empaddressId = empaddressId;
	}

	@Override
	public String toString() {
		return "Employeedata [empdataId=" + empdataId + ", city=" + city + ", district=" + district + ", empaddressId="
				+ empaddressId + "]";
	}
	
}