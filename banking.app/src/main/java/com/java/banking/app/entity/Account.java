package com.java.banking.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tbl_customer_detail")
public class Account {

	

	@Id
	private Long id;
	
	@Field(name = "account_holder_name")
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

	public Account(Long id, String accountHolderName, double balance) {
		
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Account() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
