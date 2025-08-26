package com.AccountSummary.spring.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LinkedAccounts {

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name="accountId_linkedacc")
	private String accountId;
	private String type;
	@Column(name ="currency_linkedacc")
	private String currency;
	@Column(name ="balance_linkedacc")
	private String balance;
	
	@Column(name="status_linkedcc")
	private String status;
	
	

}
