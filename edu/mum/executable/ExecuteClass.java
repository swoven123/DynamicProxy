package edu.mum.executable;

import edu.mum.dao.AccountDao;
import edu.mum.dao.IAccountDao;
import edu.mum.dynamicproxies.LoggingProxy;
import edu.mum.dynamicproxies.TimingProxy;
import edu.mum.service.AccountService;
import edu.mum.service.IAccountService;

public class ExecuteClass {
	
	public static void main(String[] args) {
		IAccountService accountServiceProxy = (IAccountService)LoggingProxy.newInstance(new 
				AccountService(new AccountDao()));
		
		accountServiceProxy.createAccount();
		
		System.out.println("=================================");
		
		accountServiceProxy.deposit();
		System.out.println("==================================");
		
		IAccountService accountServiceProxyTiming = (IAccountService)TimingProxy.newInstance(new 
				AccountService(new AccountDao()));
		
		accountServiceProxyTiming.getAllAccounts();
		System.out.println("=================================");
		
		IAccountDao accountDaoProxy = (IAccountDao)TimingProxy.newInstance(new AccountDao());
		accountDaoProxy.getAccounts();
	}
	
}