package com.paytm.bankAPI.dao;

import java.util.List;

import com.paytm.bankAPI.entities.Bank;

public interface BankDao {
	
	public List<Bank> getAllBankDetails();
}
