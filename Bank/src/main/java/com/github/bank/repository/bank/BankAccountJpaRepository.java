package com.github.bank.repository.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountJpaRepository extends JpaRepository<BankAccount, Integer> {
}
