package com.ravi.rating.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.rating.rating.entity.Rating;
import com.ravi.rating.rating.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingRestController {
	
	@Autowired
	RatingService ratingService;

	@PostMapping("/create")
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.save(rating));
	}
	
	@GetMapping("/findById/{ratingId}")
	public ResponseEntity<Rating> findById(@PathVariable String ratingId){
		return ResponseEntity.ok(ratingService.findById(ratingId));
	}
	
	@GetMapping("list")
	public ResponseEntity<List<Rating>> findAll(){
		return ResponseEntity.ok(ratingService.findAll());
	}
	

	@GetMapping("/findByUserId/{userId}")
	public ResponseEntity<List<Rating>> findByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.findByUserId(userId));
	}
	
	@GetMapping("/findByHotelId/{hotelId}")
	public ResponseEntity<List<Rating>> findByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.findByHotelId(hotelId));
	}
}
