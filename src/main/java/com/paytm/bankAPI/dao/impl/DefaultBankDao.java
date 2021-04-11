package com.paytm.bankAPI.dao.impl;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.paytm.bankAPI.dao.BankDao;
import com.paytm.bankAPI.entities.Bank;

@Repository
public class DefaultBankDao implements BankDao {
	
	private MongoOperations mongoOperations;

	@Override
	public List<Bank> getAllBankDetails() {
		
		List<Bank> bankList = mongoOperations.findAll(Bank.class);
		
		return bankList;
	}

}
