package com.ravi.user.service.service;

import java.util.List;

import com.ravi.user.service.entity.User;

public interface UserService {

	User findById(String id);
	
	List<User> findAll();
	
	void save(User user);
}
