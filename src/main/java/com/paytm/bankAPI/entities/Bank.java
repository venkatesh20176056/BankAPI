package com.paytm.bankAPI.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "bank")
public class Bank {
	
	@Field("name")
	private String name;
	
	@Field("ifsc")
	private String ifsc;
	
	@Field("branch")
	private String branch;
	
	@Field("transactions")
	private Long transactions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Long getTransactions() {
		return transactions;
	}

	public void setTransactions(Long transactions) {
		this.transactions = transactions;
	}
	
}
