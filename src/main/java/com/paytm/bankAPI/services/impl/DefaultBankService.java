package com.paytm.bankAPI.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paytm.bankAPI.dao.BankDao;
import com.paytm.bankAPI.entities.Bank;
import com.paytm.bankAPI.exceptions.InvalidMongoException;
import com.paytm.bankAPI.services.BankService;

@Service
public class DefaultBankService implements BankService {
	
	private BankDao bankDao; 
	
	@Autowired
	public DefaultBankService(BankDao bankDao) {

		this.bankDao = bankDao;
	}

	@Override
	public List<Bank> getAllBankDetails() throws InvalidMongoException {
		
		return bankDao.getAllBankDetails();
	}

	
	
	
}
