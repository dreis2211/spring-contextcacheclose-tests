package com.example.contextcacheclose.account;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private Long id;

	private String username;

	private String password;

}
