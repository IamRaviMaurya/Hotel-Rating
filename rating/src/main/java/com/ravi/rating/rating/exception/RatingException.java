package com.ravi.rating.rating.exception;

public class RatingException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public RatingException () {
		super("Data not found !");
	}
	
	public RatingException (String message) {
		super(message);
	}

}
