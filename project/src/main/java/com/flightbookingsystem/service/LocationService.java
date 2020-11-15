package com.flightbookingsystem.service;

import java.util.List;

import com.flightbookingsystem.model.Location;


public interface LocationService {
	public Location addLocation(Location l);
	public Location modifyLocation(Location l);
	public void deleteLocation(int id);
	public List<Location> getAllLocations();

}
