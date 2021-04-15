package com.paytm.bankAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paytm.bankAPI.constants.URLConstants;
import com.paytm.bankAPI.dto.response.ErrorDetails;
import com.paytm.bankAPI.dto.response.ErrorResponse;
import com.paytm.bankAPI.dto.response.SuccessResponse;
import com.paytm.bankAPI.entities.Bank;
import com.paytm.bankAPI.exceptions.InvalidMongoException;
import com.paytm.bankAPI.services.BankService;

@RestController
public class BankController {
	
	private BankService bankService;
	
	@Autowired
	public BankController(BankService bankService) {
		this.bankService = bankService;
	}

	@RequestMapping(value = URLConstants.GET_ALL, method = RequestMethod.GET)
	public ResponseEntity<?> getAllBankDetails() throws InvalidMongoException{
		try {
			
		List<Bank> bankList = bankService.getAllBankDetails();
		SuccessResponse successResponse = new SuccessResponse("SUCCESS", bankList);
		ResponseEntity<SuccessResponse> response = new ResponseEntity<SuccessResponse>(successResponse, HttpStatus.OK);
		
		return response;
		}
		catch(InvalidMongoException e) {
			
			ErrorResponse errorResponse = new ErrorResponse("FAIL", new ErrorDetails(e.getMessage()));
			ResponseEntity<ErrorResponse> response = new ResponseEntity<ErrorResponse>(errorResponse, e.getErrorMessages().getStatus());
			return response;
		}
	}
}
