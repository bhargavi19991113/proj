package com.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingsystem.model.Flight;
import com.flightbookingsystem.repository.FlightRepository;

@Service
public class FlightServiceImplementation implements FlightService {

	@Autowired
	FlightRepository frepository;
	@Override
	public List<Flight> getAllFlights(){
		return frepository.findAll();
	}
	@Override
	public Flight addFlight(Flight f) {
			// TODO Auto-generated method stub
			return frepository.save(f);
		}
	@Override
	public Flight modifyFlight(Flight f) {
		// TODO Auto-generated method stub
		Optional<Flight> fli=frepository.findById(f.getId());
		Flight flight=fli.get();
		//fli.setStatus(f.getStatus());
		return frepository.save(flight);
	}
	@Override
	public void deleteFlight(int id) {
		// TODO Auto-generated method stub
		frepository.deleteById(id);
	}



	}



