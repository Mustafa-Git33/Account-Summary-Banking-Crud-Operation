package com.AccountSummary.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AccountSummary.spring.boot.dao.AccountSummaryRepository;
import com.AccountSummary.spring.boot.entity.AccountEntity;

@Service
public class AccountSummaryService implements IAccountSummService {

    @Autowired
    private AccountSummaryRepository repository;

    @Override
    public List<AccountEntity> getAllAccounts() {
        return repository.findAll();
    }

    @Override
    public AccountEntity createAccount(AccountEntity account) {
        return repository.save(account);
    }

    @Override
    public Optional<AccountEntity> getAccountByCustomerId(String customerId) {
        return repository.findByCustomerId(customerId);
    }
}
