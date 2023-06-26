package com.sw.JPArelations.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sw.JPArelations.model.Student;

@Entity
@Table(name = "STDNT")

public class Student {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name="studentId")
	    private Integer studentId;

		@Column(name="name")
	    private String name;
	    
		@Column(name="email")
	    private String email;
		
//		@Column(name="Dob")
//		private LocalDate Dob;
		
//		@Formula(value =“date_part(‘year’, age(Dob))”)
//		 private int age;
//		 
		@OneToMany
		@JoinColumn(name = "CId", nullable = false, updatable = false, insertable = false)
		
		private List<College> college;
		
	    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		
	    @JoinTable(name ="STD_SUBJS", joinColumns = { @JoinColumn(name = "studentId") },
	    inverseJoinColumns = {    @JoinColumn(name = "subjectId") })
	    @JsonManagedReference
    	 
	    private List<Subject> subject;

	    public Student() {
	    }

		public Student(Integer studentId, String name, String email, Date Dob, int age, List<College> college,
				List<Subject> subject) {
			super();
			this.studentId = studentId;
			this.name = name;
			this.email = email;
//			this.Dob = Dob;
//			this.age = age;
			this.college = college;
			this.subject = subject;
		}

		public Integer getStudentId() {
			return studentId;
		}

		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

//		public Date getDob() {
//			return Dob;
//		}
//
//		public void setDob(Date Dob) {
//			Dob = Dob;
//		}
//
//		public int getAge() {
//			return age;
//		}
//
//		public void setAge(int age) {
//			this.age = age;
//		}

		public List<College> getCollege() {
			return college;
		}

		public void setCollege(List<College> college) {
			this.college = college;
		}

		public List<Subject> getSubject() {
			return subject;
		}

		public void setSubject(List<Subject> subject) {
			this.subject = subject;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", college=" + college + ", subject=" + subject + "]";
		}

}
	