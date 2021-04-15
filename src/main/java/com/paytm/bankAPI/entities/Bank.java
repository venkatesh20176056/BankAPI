package com.paytm.bankAPI.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "bank_details")
public class Bank {
	
	@Field("name_of_bank")
	private String nameOfBank;
	
	@Field("ifsc_of_bank")
	private String ifscOfBank;
	
	@Field("branch_of_bank")
	private String branchOfBank;
	
	@Field("transactions_of_bank")
	private Long transactionsOfBank;

	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	public String getIfscOfBank() {
		return ifscOfBank;
	}

	public void setIfscOfBank(String ifscOfBank) {
		this.ifscOfBank = ifscOfBank;
	}

	public String getBranchOfBank() {
		return branchOfBank;
	}

	public void setBranchOfBank(String branchOfBank) {
		this.branchOfBank = branchOfBank;
	}

	public Long getTransactionsOfBank() {
		return transactionsOfBank;
	}

	public void setTransactionsOfBank(Long transactionsOfBank) {
		this.transactionsOfBank = transactionsOfBank;
	}

}
