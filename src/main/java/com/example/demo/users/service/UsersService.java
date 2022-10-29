package com.example.demo.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.users.models.UserDto;


public interface UsersService extends UserDetailsService{
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
}
