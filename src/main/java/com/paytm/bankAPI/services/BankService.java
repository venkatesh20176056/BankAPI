package com.paytm.bankAPI.services;

import java.util.List;

import com.paytm.bankAPI.entities.Bank;
import com.paytm.bankAPI.exceptions.InvalidMongoException;

public interface BankService {
	
	public List<Bank> getAllBankDetails() throws InvalidMongoException;
	
	public String insertBank(String name, String ifsc);
}
