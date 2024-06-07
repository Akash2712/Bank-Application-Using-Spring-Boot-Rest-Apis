package com.java.banking.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.java.banking.app.dto.AccountDto;
import com.java.banking.app.entity.Account;
import com.java.banking.app.mapper.AccountMapper;
import com.java.banking.app.repository.AccountRepository;
import com.java.banking.app.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepo;

	public AccountServiceImpl(AccountRepository accountRepo) {

		this.accountRepo = accountRepo;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {

		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccount(Long id) {
		// TODO Auto-generated method stub

		Account account = accountRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		// TODO Auto-generated method stub

		Account account = accountRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));

		double total = account.getBalance() + amount;
		account.setBalance(total);

		Account savedAccount = accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto withdrawal(Long id, double amount) {

		Account account = accountRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));

		if (account.getBalance() < amount) {

			throw new RuntimeException("Insufficient Balance");
		}
		double total = account.getBalance() - amount;
		account.setBalance(total);

		Account savedAccount = accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);

	}

	@Override
	public List<AccountDto> getAllAccounts() {
		// TODO Auto-generated method stub

		List<Account> accounts = accountRepo.findAll();

		return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());

	}

	@Override
	public void deleteAccount(Long id) {
		// TODO Auto-generated method stub
		
		Account account = accountRepo.findById(id).orElseThrow(() -> new RuntimeException("Account does not exist"));
		
		accountRepo.deleteById(id);
	}

}
