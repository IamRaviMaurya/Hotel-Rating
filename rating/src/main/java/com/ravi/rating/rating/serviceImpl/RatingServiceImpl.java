package com.ravi.rating.rating.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.rating.rating.entity.Rating;
import com.ravi.rating.rating.exception.RatingException;
import com.ravi.rating.rating.repository.RatingRepository;
import com.ravi.rating.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	RatingRepository userRepository;

	@Override
	public Rating findById(String id) {
		return userRepository.findById(id).orElseThrow(()-> new RatingException("User not find with given id  "+ id) );
	}

	@Override
	public List<Rating> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Rating save(Rating rating) {
		rating.setId(UUID.randomUUID().toString());
		return userRepository.save(rating);
	}

	@Override
	public List<Rating> findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> findByHotelId(String hotelId) {
		return userRepository.findByHotelId(hotelId);
	}

}
