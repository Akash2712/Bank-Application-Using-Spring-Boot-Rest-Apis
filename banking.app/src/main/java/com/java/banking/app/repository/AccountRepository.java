package com.java.banking.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.banking.app.entity.Account;

public interface AccountRepository extends MongoRepository<Account, Long> {

	
}
