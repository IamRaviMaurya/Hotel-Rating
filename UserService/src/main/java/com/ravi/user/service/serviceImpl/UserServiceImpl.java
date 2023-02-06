package com.ravi.user.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ravi.user.service.entity.User;
import com.ravi.user.service.exception.UserException;
import com.ravi.user.service.repository.UserRepository;
import com.ravi.user.service.response.Rating;
import com.ravi.user.service.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public User findById(String id) {
		User user = userRepository.findById(id).orElseThrow(()-> new UserException("User not find with given id  "+ id) );
		ArrayList<Rating> ratings = restTemplate.getForObject("http://localhost:9092/rating/findByUserId/"+user.getId(), ArrayList.class);
		user.setRatings(ratings);
		return user;
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
