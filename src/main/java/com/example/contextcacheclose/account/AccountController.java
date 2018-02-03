package com.example.contextcacheclose.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("account")
public class AccountController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Account";
	}

}
