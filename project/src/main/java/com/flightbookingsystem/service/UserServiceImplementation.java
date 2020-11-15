package com.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingsystem.model.User;
import com.flightbookingsystem.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository urepository;
	
	@Override
	public User addUser(User u) {
		return urepository.save(u);
	}
	
	@Override
	public User modifyUser(User u) {
		
		Optional<User> use=urepository.findById(u.getId());
		User user=use.get();
		//fli.setStatus(f.getStatus());
		return urepository.save(user);
	}
	
	@Override
	public void deleteUser(int id) {
		urepository.deleteById(id);
	}
	
	@Override
	public List<User> getAllUsers(){
		
		return urepository.findAll();
	}
	
}
