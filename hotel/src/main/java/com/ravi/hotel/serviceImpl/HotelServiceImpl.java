package com.ravi.hotel.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.hotel.entity.Hotel;
import com.ravi.hotel.exception.HotelCutsomException;
import com.ravi.hotel.repository.HotelRepository;
import com.ravi.hotel.service.HotelService;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel findById(String id) {
		return hotelRepository.findById(id).orElseThrow(()->new HotelCutsomException("Data not find with given id " + id));
	}

	@Override
	public Hotel save(Hotel hotel) {
		hotel.setId(UUID.randomUUID().toString());
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> findAll() {
		return hotelRepository.findAll();
	}
	
}
