package com.AccountSummary.spring.boot.service;

import java.util.List;

import com.AccountSummary.spring.boot.entity.AccountEntity;


public interface IAccountSummService {

	
	
	List<AccountEntity> getCustomerId();
	AccountEntity createAccSummData(AccountEntity AccSummData);
//	Book updateBook(int bookId, Book book);
	AccountEntity getCustomerId(String customerId);
	//boolean deleteBook(int bookId);
}
