package com.java.banking.app.service;

import java.util.List;

import com.java.banking.app.dto.AccountDto;

public interface AccountService {

	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccount(Long id);
	
	AccountDto deposit(Long id , double amount);
	
	AccountDto withdrawal(Long id , double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long id);
}
