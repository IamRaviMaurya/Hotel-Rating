package com.ravi.user.service.exception;

public class UserException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UserException () {
		super("Data not found !");
	}
	
	public UserException (String message) {
		super(message);
	}

}
