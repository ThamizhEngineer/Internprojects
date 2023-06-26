package com.sw.JPArelations.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name = "SUBJS")
public class Subject {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    @Column(name="subjectId")
	    private Long subjectId;
		
		@Column(name="subname")
		private String subname;
		
		@Column(name="subcode")
		private String subcode;
		 
		@Column(name="subduration")
		private Integer subduration;
		
		@Formula("(SELECT min(s.subduration) FROM SUBJS s )")
		private Integer total;
		
		@Formula("subcode+subduration")
		private Integer codeduration;
		
		@Formula("(SELECT MAX(subduration) AS Largest FROM SUBJS;)")
	    @ManyToMany(targetEntity = Student.class, mappedBy = "subject", cascade = CascadeType.ALL)
	    @JsonBackReference
	
	    private List<Student> student;
	    

	public Subject() {
		
	}


	public Subject(Long subjectId, String subname, String subcode, Integer subduration, Integer total,Integer codeduration,
			List<Student> student) {
		super();
		this.subjectId = subjectId;
		this.subname = subname;
		this.subcode = subcode;
		this.subduration = subduration;
		this.total = total;
		this.codeduration=codeduration;
		this.student = student;
	}


	public Long getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}


	public String getSubname() {
		return subname;
	}


	public void setSubname(String subname) {
		this.subname = subname;
	}


	public String getSubcode() {
		return subcode;
	}


	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}


	public Integer getSubduration() {
		return subduration;
	}


	public void setSubduration(Integer subduration) {
		this.subduration = subduration;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}

	
	public Integer getCodeduration() {
		return codeduration;
	}


	public void setCodeduration(Integer codeduration) {
		this.codeduration = codeduration;
	}


	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subname=" + subname + ", subcode=" + subcode + ", subduration="
				+ subduration + ", total=" + total + ", codeduration=" + codeduration + ", student=" + student + "]";
	}


	
	
}
