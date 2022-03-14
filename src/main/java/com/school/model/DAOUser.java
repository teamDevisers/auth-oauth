package com.school.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "auth",name = "Credentials")
@Data
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private String password;
	@Column(name = "Role")
	private String role;


}