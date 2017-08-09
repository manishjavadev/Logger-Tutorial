package com.manish.javadev.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.manish.javadev.spring.model.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	private static final Logger logger = LoggerFactory.getLogger(AccountDaoImpl.class);

	public void withdrawAmount(Long accountFrom, Double amount) {
		// TODO Auto-generated method stub

	}

	public void depositAmount(Long accountTo, Double ammount) {
		// TODO Auto-generated method stub

	}

	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}