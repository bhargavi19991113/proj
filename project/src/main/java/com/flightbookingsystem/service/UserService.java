package com.flightbookingsystem.service;

import java.util.List;

import com.flightbookingsystem.model.User;


public interface UserService {
	public User addUser(User u);
	public void deleteUser(int id);
	public User modifyUser(User u);
	public List<User> getAllUsers();

}
