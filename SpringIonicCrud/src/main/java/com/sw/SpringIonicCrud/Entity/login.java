package com.sw.SpringIonicCrud.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="logininc")
public class login {
	@Id
	
	private Integer id;
	private String username;
	private String password;
	
}
