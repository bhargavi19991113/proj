package com.flightbookingsystem.service;

import java.util.List;


import com.flightbookingsystem.model.Fleet;


public interface FleetService {
	public Fleet addFleet(Fleet fl);
	public Fleet modifyFleet(Fleet fl);
	public void deleteFleet(int id);
	public List<Fleet> getAllFleet(); 

}
