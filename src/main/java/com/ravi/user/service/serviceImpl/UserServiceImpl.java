package com.ravi.user.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.user.service.entity.User;
import com.ravi.user.service.exception.UserException;
import com.ravi.user.service.repository.UserRepository;
import com.ravi.user.service.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User findById(String id) {
		return userRepository.findById(id).orElseThrow(()-> new UserException("User not find with given id  "+ id) );
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void save(User user) {
		user.setId(UUID.randomUUID().toString());
		userRepository.save(user);
	}

}
