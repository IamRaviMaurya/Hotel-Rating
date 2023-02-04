package com.ravi.user.service.controller;

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

import com.ravi.user.service.entity.User;
import com.ravi.user.service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> create(@RequestBody User user){
		userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	@GetMapping("{userId}")
	public ResponseEntity<User> findById(@PathVariable String userId){
		return ResponseEntity.ok(userService.findById(userId));
	}
	
	@GetMapping("list")
	public ResponseEntity<List<User>> findAll(){
		return ResponseEntity.ok(userService.findAll());
	}
}
