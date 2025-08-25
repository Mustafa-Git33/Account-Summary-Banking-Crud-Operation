package com.AccountSummary.spring.boot.dao;

import com.AccountSummary.spring.boot.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountSummaryRepository extends JpaRepository<AccountEntity, Integer> {
    Optional<AccountEntity> findByCustomerId(String customerId); // Custom finder
}
