package edu.mum.service;

import java.util.List;

import edu.mum.domain.Account;

public interface IAccountService {
	
	void createAccount();
	void deposit();
	void withdraw();
	void transferFund();
	List<Account> getAllAccounts();
	Account getAccount();

}
