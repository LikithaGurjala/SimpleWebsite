package com.example.simplewebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplewebsite.model.User;
import com.example.simplewebsite.repository.UserRepository;

@RestController
@RequestMapping("/api") 
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();	
	}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
