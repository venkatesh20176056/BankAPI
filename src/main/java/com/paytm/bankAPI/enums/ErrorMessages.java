package com.paytm.bankAPI.enums;

import org.springframework.http.HttpStatus;

public enum ErrorMessages {
	
    NO_DATA_FOUND(1, HttpStatus.BAD_REQUEST, "NO Data found");
	
	int code;
	HttpStatus status;
	String message;
	
	ErrorMessages(int code, HttpStatus status, String message) {
		this.code = code;
		this.status = status;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
