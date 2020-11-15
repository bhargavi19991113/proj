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

import com.flightbookingsystem.model.Flight;
import com.flightbookingsystem.service.FlightService;




@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class FlightController {
	
	@Autowired
	FlightService flightservice;

	@GetMapping("/flight")
	public List<Flight> getAllFlights(){
		return flightservice.getAllFlights();
	}
	
	@PostMapping("/flight")
	public Flight addFlight(@RequestBody Flight f) {
		return flightservice.addFlight(f);
	}
	
	@PutMapping("/flight")
	public Flight modifyFlight(@RequestBody Flight f) {
		return flightservice.modifyFlight(f);
	}
	
	@GetMapping("/flight/afterDelete/{id}")
	public List<Flight> deleteRequirement(@PathVariable int id){
		flightservice.deleteFlight(id);
		return flightservice.getAllFlights();
	}
	

}
