package com.ubk.bank.money.transfer.repository;

import com.ubk.bank.money.transfer.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountId(Long accountNumber);
}
