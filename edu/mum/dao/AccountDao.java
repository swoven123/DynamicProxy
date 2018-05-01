package edu.mum.dao;

import java.util.ArrayList;
import java.util.List;

import edu.mum.domain.Account;

public class AccountDao implements IAccountDao {

	@Override
	public void saveAccount() {
		System.out.println("Dao Account Saved");
		
	}

	@Override
	public void loadAccount() {
		System.out.println("Dao account loaded");
		
	}

	@Override
	public void updateAccount() {
		System.out.println("Dao updated account");
		
	}

	@Override
	public List<Account> getAccounts() {
		System.out.println("Dao got all account");
		Account one =new Account();
		Account two =new Account();
		
		List<Account> listOfAccounts = new ArrayList<>();
		listOfAccounts.add(one);
		listOfAccounts.add(two);
		return listOfAccounts;
	}
	
	

}
