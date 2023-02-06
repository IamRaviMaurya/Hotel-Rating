package com.ravi.hotel.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ravi.hotel.response.ApiResponse;

@RestControllerAdvice
public class HotelException implements Serializable {
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse> eceptionHnadler(Exception e){
		ApiResponse response = ApiResponse.builder()
				.message(e.getMessage())
				.isSuccess(false)
				.status(HttpStatus.NOT_FOUND)
				.build();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
