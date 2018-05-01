package edu.mum.dao;

import java.util.List;

import edu.mum.domain.Account;

public interface IAccountDao {
	
	void saveAccount();
	void loadAccount();
	void updateAccount();
	List<Account> getAccounts();
}
