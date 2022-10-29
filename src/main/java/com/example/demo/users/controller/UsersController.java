package com.example.demo.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.users.models.CreateUserRequest;
import com.example.demo.users.models.UserDetails;
import com.example.demo.users.service.UserService;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/status/check")
	public String status() {
		return "Working";
	}
	
	
	@GetMapping("/get-user/all")
	public ResponseEntity<List<UserDetails>>  getUserDetails() {
		List<UserDetails> userDetails = userService.getUserDetails();
		return new ResponseEntity<List<UserDetails>>(userDetails, HttpStatus.OK);
	}

	
	@PostMapping
	public String createUser(@RequestBody CreateUserRequest  userDetails) {
		return "create user" + userDetails.getFirstName() ;
	}
	
}
