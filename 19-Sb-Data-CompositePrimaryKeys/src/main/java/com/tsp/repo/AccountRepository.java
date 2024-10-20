package com.tsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Account;
import com.tsp.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk>{

}
