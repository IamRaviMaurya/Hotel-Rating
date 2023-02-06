package com.ravi.rating.rating.service;

import java.util.List;

import com.ravi.rating.rating.entity.Rating;

public interface RatingService {

	Rating findById(String id);
	
	List<Rating> findAll();
	
	Rating save(Rating rating);
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
}
