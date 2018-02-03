package com.example.contextcacheclose;

import com.example.contextcacheclose.account.Account;
import com.example.contextcacheclose.account.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContextCacheCloseThirdApplicationTests {

	@Autowired
	private AccountRepository accountRepository;

	@Test
	public void accountIsNotFound() {
		Account account = accountRepository.findOne(1L);
		Assert.assertNull(account);
	}

}
