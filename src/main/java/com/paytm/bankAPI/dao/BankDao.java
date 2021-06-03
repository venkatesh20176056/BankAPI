package com.paytm.bankAPI.dao;

import java.util.List;

import com.paytm.bankAPI.entities.Bank;
import com.paytm.bankAPI.exceptions.InvalidMongoException;

public interface BankDao {
	
	public List<Bank> getAllBankDetails() throws InvalidMongoException;
	
	public String insertBank(String name, String ifsc);
}
