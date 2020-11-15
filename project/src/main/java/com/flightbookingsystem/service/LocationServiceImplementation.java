package com.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.flightbookingsystem.model.Location;
import com.flightbookingsystem.repository.LocationRepository;

@Service
public class LocationServiceImplementation implements LocationService{
	
	@Autowired
	LocationRepository lrepository;
	
	@Override
	public Location addLocation(Location l) {
		return lrepository.save(l);
	}
	
	
	@Override
	public void deleteLocation(int id) {
		lrepository.deleteById(id);
	}
	
	@Override
	public Location modifyLocation(Location l) {
		Optional<Location> loc=lrepository.findById(l.getId());
		Location location=loc.get();
		//fli.setStatus(f.getStatus());
		return lrepository.save(location);
	}
	
	@Override
	public List<Location> getAllLocations(){
		return lrepository.findAll();
	}
	

}
