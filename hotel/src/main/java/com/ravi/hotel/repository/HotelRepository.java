package com.ravi.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{
}
