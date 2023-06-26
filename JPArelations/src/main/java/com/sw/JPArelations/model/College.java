package com.sw.JPArelations.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "COLLEGE")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="clgid")
    private Integer clgid;
	
	@Column(name="clgname")
	private String clgname;
	
	@Column(name="place")
	private String place;
	
	@Column(name="CId")
	private Integer CId;
	
	@Column(name="Fees")
	private Integer Fees;
	
	@Formula("Fees * 2")
	   private float AnnualFees;
	public College() {}

public College(Integer clgid, String clgname, String place, Integer cId,Integer fees) {
	super();
	this.clgid = clgid;
	this.clgname = clgname;
	this.place = place;
	CId = cId;
	Fees = fees;
	
}

public Integer getClgid() {
	return clgid;
}

public void setClgid(Integer clgid) {
	this.clgid = clgid;
}

public String getClgname() {
	return clgname;
}

public void setClgname(String clgname) {
	this.clgname = clgname;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Integer getCId() {
	return CId;
}

public void setCId(Integer cId) {
	CId = cId;
}

public Integer getFees() {
	return Fees;
}

public void setFees(Integer fees) {
	Fees = fees;
}

public float getAnnualFees() {
	return AnnualFees;
}

public void setAnnualFees(float annualFees) {
	AnnualFees = annualFees;
}

@Override
public String toString() {
	return "College [clgid=" + clgid + ", clgname=" + clgname + ", place=" + place + ", CId=" + CId + ", Fees=" + Fees
			+ ", AnnualFees=" + AnnualFees + "]";
}

	
	
}
