package edu.mum.domain;

import java.util.List;

public class Account {
	
	private Customer customer;
	
	private List<AccountEntry> listOfEntry;
	
	private int acocuntNumber;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<AccountEntry> getListOfEntry() {
		return listOfEntry;
	}

	public void setListOfEntry(List<AccountEntry> listOfEntry) {
		this.listOfEntry = listOfEntry;
	}

	public int getAcocuntNumber() {
		return acocuntNumber;
	}

	public void setAcocuntNumber(int acocuntNumber) {
		this.acocuntNumber = acocuntNumber;
	}
	
}
