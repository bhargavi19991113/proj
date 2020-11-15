package com.flightbookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbookingsystem.model.User;
import com.flightbookingsystem.service.UserService;



@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("/User")
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@PostMapping("/User")
	public User addUser(@RequestBody User u) {
		return userservice.addUser(u);
	}
	
	@PutMapping("/User")
	public User modifyUser(@RequestBody User u) {
		return userservice.modifyUser(u);
	}
	
	@GetMapping("/User/afterDelete/{id}")
	public List<User> deleteUser(@PathVariable int id){
		userservice.deleteUser(id);
		return userservice.getAllUsers();
	}

	

}
