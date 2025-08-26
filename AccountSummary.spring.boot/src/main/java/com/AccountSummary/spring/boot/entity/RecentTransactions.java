package com.AccountSummary.spring.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RecentTransactions {
	
	private String transactionId;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBalanceAfter() {
		return balanceAfter;
	}
	public void setBalanceAfter(String balanceAfter) {
		this.balanceAfter = balanceAfter;
	}
	private String date;
	@Column(name="type_recent")
	private String type;
	private String description;
	private String amount;
	
	@Column(name="currency_recent")
	private String currency;
	private String balanceAfter;
	
}
