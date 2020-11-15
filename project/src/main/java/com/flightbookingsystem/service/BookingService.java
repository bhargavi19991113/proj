package com.flightbookingsystem.service;

import java.util.List;

import com.flightbookingsystem.model.Booking;


public interface BookingService {
	public List<Booking> getAllBookings();
	public Booking addBooking(Booking b);
	public void deleteBooking(int id);
	

}
