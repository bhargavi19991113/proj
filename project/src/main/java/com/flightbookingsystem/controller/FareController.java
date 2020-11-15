package com.flightbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbookingsystem.model.Fare;
import com.flightbookingsystem.service.FareService;


@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class FareController {
	
	@Autowired
	FareService fareservice;
	
	@PutMapping("/requirements")
	public Fare modifyFare(@RequestBody Fare f) {
		return fareservice.modifyFare(f);
	}

}
