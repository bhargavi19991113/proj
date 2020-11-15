package com.flightbookingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbookingsystem.model.Booking;
import com.flightbookingsystem.service.BookingService;






@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")

public class BookingController {
	
	@Autowired
	BookingService booking;
	
	@PostMapping("/booking")
	public  Booking addBooking(@RequestBody Booking b) {
		return booking.addBooking(b);
	}
	
	@GetMapping("/booking/afterDelete/{id}")
	public List<Booking> deleteBooking(@PathVariable int id){
		booking.deleteBooking(id);
		return booking.getAllBookings();
	}
	
	@GetMapping("/booking")
	public List<Booking> getAllBookings(){
		return booking.getAllBookings();
	}
	
	


}
