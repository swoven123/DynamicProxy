package edu.mum.service;

import java.util.List;

import edu.mum.dao.AccountDao;
import edu.mum.domain.Account;

public class AccountService implements IAccountService{
	
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	public void createAccount() {
		System.out.println("Service create Account");
		accountDao.saveAccount();
		
	}

	@Override
	public void deposit() {
		System.out.println("Service Desposit");
		accountDao.updateAccount();
		
	}

	@Override
	public void withdraw() {
		System.out.println("Service withdraw");
		accountDao.updateAccount();
		
	}

	@Override
	public void transferFund() {
		System.out.println("Service transfer");
		accountDao.updateAccount();
		
	}

	@Override
	public List<Account> getAllAccounts() {
		System.out.println("Service getallaccounts");
		return accountDao.getAccounts();
	}

	@Override
	public Account getAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
