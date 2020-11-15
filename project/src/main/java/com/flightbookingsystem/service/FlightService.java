package com.flightbookingsystem.service;

import java.util.List;


import com.flightbookingsystem.model.Flight;

public interface FlightService {
	public List<Flight> getAllFlights();
	public Flight addFlight(Flight f);
	public Flight modifyFlight(Flight f);
	public void deleteFlight(int id);

}
