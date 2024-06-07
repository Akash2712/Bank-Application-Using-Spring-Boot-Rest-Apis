package com.java.banking.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDto {

	
	private Long id;
	private String accountHolderName;

	private double balance;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountDto(Long id, String accountHolderName, double balance) {
		
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public AccountDto() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
