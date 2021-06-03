package com.paytm.bankAPI.dao.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.paytm.bankAPI.dao.BankDao;
import com.paytm.bankAPI.entities.Bank;
import com.paytm.bankAPI.enums.ErrorMessages;
import com.paytm.bankAPI.exceptions.InvalidMongoException;

@Repository("accessData")
public class DefaultBankDao implements BankDao {
	
	private MongoOperations mongoOperations;
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultBankDao.class);

	@Autowired
	public DefaultBankDao(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	@Override
	public List<Bank> getAllBankDetails() throws InvalidMongoException{
		
		LOGGER.info("DefaultBankDao called");
		
		List<Bank> bankList = mongoOperations.findAll(Bank.class);
		
		if(bankList == null) 
			throw new InvalidMongoException(ErrorMessages.NO_DATA_FOUND);
		
		for (Bank b: bankList)
			LOGGER.info("data", b);
		
		return bankList;
	}

	@Override
	public String insertBank(String name, String ifsc) {
		
		Bank bank = new Bank();
		
		bank.setNameOfBank(name);
		bank.setIfscOfBank(ifsc);
		
		mongoOperations.insert(bank);

		return "Successfully inserted";
	}

}
