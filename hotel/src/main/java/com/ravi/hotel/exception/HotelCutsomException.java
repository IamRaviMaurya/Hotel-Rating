package com.ravi.hotel.exception;

public class HotelCutsomException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	HotelCutsomException(){
		super("Data not found .");
	}
	
	public HotelCutsomException(String message){
		super(message);
	}
}
