package com.blz.employeePayrollJDBC;

public class PayrollSystemException extends Exception {

	enum ExceptionType {
		UPDATE_FILE_EXCEPTION
	}

	ExceptionType type;

	public PayrollSystemException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}