package com.ravi.hotel.service;

import java.util.List;

import com.ravi.hotel.entity.Hotel;

public interface HotelService {
	Hotel findById(String id);

	Hotel save(Hotel hotel);

	List<Hotel> findAll();
}
