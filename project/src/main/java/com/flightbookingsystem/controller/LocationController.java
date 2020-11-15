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

import com.flightbookingsystem.model.Location;
import com.flightbookingsystem.service.LocationService;



@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")

public class LocationController {

	@Autowired
	LocationService locationservice;
	
	@GetMapping("/locations")
	public List<Location> getAllLocations(){
		return locationservice.getAllLocations();
	}
	
	@PostMapping("/locations")
	public Location addLocation(@RequestBody Location l) {
		return locationservice.addLocation(l);
	}
	
	@PutMapping("/locations")
	public Location modifyLocation(@RequestBody Location l) {
		return locationservice.modifyLocation(l);
	}
	
	@GetMapping("/locations/afterDelete/{id}")
	public List<Location> deleteRequirement(@PathVariable int id){
		locationservice.deleteLocation(id);
		return locationservice.getAllLocations();
	}

}
