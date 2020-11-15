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

import com.flightbookingsystem.model.Fleet;
import com.flightbookingsystem.service.FleetService;



@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class FleetController {
	
	@Autowired
	FleetService fleetservice;
	
	@GetMapping("/fleet")
	public List<Fleet> getAllFleet(){
		return fleetservice.getAllFleet();
	}
	
	@PostMapping("/fleet")
	public Fleet addFleet(@RequestBody Fleet f) {
		return fleetservice.addFleet(f);
	}
	
	@PutMapping("/fleet")
	public Fleet modifyFleet(@RequestBody Fleet f) {
		return fleetservice.modifyFleet(f);
	}
	
	@GetMapping("/fleet/afterDelete/{id}")
	public List<Fleet> deleteFleet(@PathVariable int id){
		fleetservice.deleteFleet(id);
		return fleetservice.getAllFleet();
	}

}
