package com.AccountSummary.spring.boot.service;

import java.util.List;
import java.util.Optional;

import com.AccountSummary.spring.boot.entity.AccountEntity;


public interface IAccountSummService {
    List<AccountEntity> getAllAccounts();
    AccountEntity createAccount(AccountEntity account);
    Optional<AccountEntity> getAccountByCustomerId(String customerId);
}
