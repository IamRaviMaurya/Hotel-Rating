package com.ravi.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.user.service.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
