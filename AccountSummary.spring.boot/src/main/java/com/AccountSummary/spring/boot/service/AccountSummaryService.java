package com.AccountSummary.spring.boot.service;

import com.AccountSummary.spring.boot.dao.AccountSummaryRepository;
import com.AccountSummary.spring.boot.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountSummaryService implements IAccountSummService {

    @Autowired
    private AccountSummaryRepository repository;

    @Override
    public List<AccountEntity> getCustomerId() {
        return repository.findAll();
    }

    @Override
    public AccountEntity createAccSummData(AccountEntity accSummData) {
        return repository.save(accSummData);
    }

    @Override
    public AccountEntity getCustomerId(String customerId) {
        return repository.findByCustomerId(customerId).orElse(null);
    }
}
