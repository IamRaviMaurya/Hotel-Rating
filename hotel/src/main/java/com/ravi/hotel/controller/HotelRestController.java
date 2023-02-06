package com.ravi.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.hotel.entity.Hotel;
import com.ravi.hotel.service.HotelService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/hotel")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HotelRestController {

	@Autowired
	HotelService hotelService;

	@PostMapping
	public ResponseEntity<Hotel> save(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.save(hotel));
	}

	@GetMapping("/list")
	public ResponseEntity<List<Hotel>> findAll() {
		return ResponseEntity.ok(hotelService.findAll());
	}

	@GetMapping("/findById/{hotelId}")
	public ResponseEntity<Hotel> findById(@RequestParam String hotelId) {
		return ResponseEntity.ok(hotelService.findById(hotelId));
	}
}
