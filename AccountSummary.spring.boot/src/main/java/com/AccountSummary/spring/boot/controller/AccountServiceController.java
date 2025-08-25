package com.AccountSummary.spring.boot.controller;

import com.AccountSummary.spring.boot.entity.AccountEntity;
import com.AccountSummary.spring.boot.service.IAccountSummService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")  // Base path
public class AccountServiceController {

    @Autowired
    private IAccountSummService service;

    @GetMapping
    public ResponseEntity<List<AccountEntity>> getAllAccounts() {
        return ResponseEntity.ok(service.getCustomerId());
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<AccountEntity> getByCustomerId(@PathVariable String customerId) {
        AccountEntity account = service.getCustomerId(customerId);
        return account != null ? ResponseEntity.ok(account) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<AccountEntity> createAccount(@RequestBody AccountEntity account) {
        return ResponseEntity.ok(service.createAccSummData(account));
    }
}
