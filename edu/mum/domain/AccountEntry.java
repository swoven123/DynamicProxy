package edu.mum.domain;

public class AccountEntry {
	
	private String date;
	private int amount;
	private String desc;
	private int fromAccountNumber;
	private String fromPersonName;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(int fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getFromPersonName() {
		return fromPersonName;
	}
	public void setFromPersonName(String fromPersonName) {
		this.fromPersonName = fromPersonName;
	}
	
	
	
}
