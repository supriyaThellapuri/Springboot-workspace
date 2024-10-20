package com.tsp.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tsp.entity.Account;
import com.tsp.entity.AccountPk;
import com.tsp.repo.AccountRepository;
@Service
public class AccountService {
	private AccountRepository accountRepository;
	
	public AccountService(AccountRepository accountRepository)
	{
		this.accountRepository = accountRepository;
	}
	public void getDataByusingPk()
	{
		AccountPk pk = new AccountPk();
		pk.setAccId(101);
		pk.setAccType("Savings");
		pk.setHolderName("Tcs");
		
		Optional<Account> findById  = accountRepository.findById(pk);
		if(findById.isPresent())
		{
			System.out.println(findById.get());
		}
		
	}
	
	public void saveAccData()
	{
		AccountPk pk = new AccountPk();
		pk.setAccId(102);
		pk.setAccType("Savings");
		pk.setHolderName("ABC");
		
		Account ac = new Account();
		ac.setBranchName("sirivella");
		ac.setMinBal(100.3);
		ac.setAccPk(pk); // setting pk class obj to entity obj
		accountRepository.save(ac);
		
	}

}
