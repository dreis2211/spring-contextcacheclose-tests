package com.example.contextcacheclose;

import com.example.contextcacheclose.account.Account;
import com.example.contextcacheclose.account.AccountRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ContextCacheCloseApplication.class,
		ContextCacheCloseSecondApplicationTests.CustomConfiguration.class},
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContextCacheCloseSecondApplicationTests {

	@Autowired
	private AccountRepository accountRepository;

	@Test
	public void accountIsNotFound() {
		Account account = accountRepository.findOne(1L);
		Assert.assertNull(account);
	}

	@TestComponent
	static class CustomConfiguration {

		@MockBean
		private AccountRepository accountRepository;

	}

}
