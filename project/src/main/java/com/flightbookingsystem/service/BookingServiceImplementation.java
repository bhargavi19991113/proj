package com.flightbookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingsystem.model.Booking;
import com.flightbookingsystem.repository.BookingRepository;

@Service
public class BookingServiceImplementation implements BookingService {
	
	@Autowired
	BookingRepository brepository;
	
	@Override
	public Booking addBooking(Booking b){
		return brepository.save(b);
	}
	
	@Override
	public void deleteBooking(int id) {
		
		brepository.deleteById(id);
	}
	
	@Override
	public List<Booking> getAllBookings(){
		return brepository.findAll();
	}

}
