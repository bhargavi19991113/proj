package com.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingsystem.model.Fleet;
import com.flightbookingsystem.repository.FleetRepository;


@Service
public class FleetServiceImplementation implements FleetService {

	
	@Autowired
	FleetRepository fleetrepository;
	
	@Override
	public Fleet addFleet(Fleet fl) {
		return fleetrepository.save(fl);
		
	}
	
	@Override
	public void deleteFleet(int id) {
		fleetrepository.deleteById(id);
	}
	
	@Override
	public Fleet modifyFleet(Fleet fl) {
		Optional<Fleet> flee=fleetrepository.findById(fl.getId());
		Fleet flight=flee.get();
		//fli.setStatus(f.getStatus());
		return fleetrepository.save(flight);
	}
	
	@Override
	public List<Fleet>getAllFleet(){
		return fleetrepository.findAll();
	}
}
