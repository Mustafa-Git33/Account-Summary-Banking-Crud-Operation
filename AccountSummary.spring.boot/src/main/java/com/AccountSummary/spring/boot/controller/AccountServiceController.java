package com.AccountSummary.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AccountSummary.spring.boot.entity.AccountEntity;
import com.AccountSummary.spring.boot.service.IAccountSummService;

@RestController
@RequestMapping("/accounts")
public class AccountServiceController {

    @Autowired
    private IAccountSummService service;

    @GetMapping
    public ResponseEntity<List<AccountEntity>> getAllAccounts() {
        return ResponseEntity.ok(service.getAllAccounts());
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<AccountEntity> getByCustomerId(@PathVariable String customerId) {
        return service.getAccountByCustomerId(customerId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AccountEntity> createAccount(@Validated @RequestBody AccountEntity account) {
        return ResponseEntity.ok(service.createAccount(account));
    }
}
