package com.paytm.bankAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paytm.bankAPI.constants.URLConstants;
import com.paytm.bankAPI.entities.Bank;
import com.paytm.bankAPI.services.BankService;

@RestController
public class BankController {
	
	private BankService bankService;
	
	@Autowired
	public BankController(BankService bankService) {

		this.bankService = bankService;
	}
	
	@RequestMapping(value = URLConstants.GET_ALL, method = RequestMethod.GET)
	public ResponseEntity<?> getAllBankDetails(){
		
		List<Bank> bankList = bankService.getAllBankDetails();
		ResponseEntity<List<Bank>> response = new ResponseEntity<List<Bank>>(bankList, HttpStatus.OK);
		return response;
	}
}
