package com.flightbookingsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbookingsystem.model.Fare;
import com.flightbookingsystem.repository.FareRepository;

@Service
public class FareServiceImplementation implements FareService{

	@Autowired
	FareRepository farerepository;
	
	@Override
	public Fare modifyFare(Fare fare) {
		Optional<Fare> far=farerepository.findById(fare.getId());
		Fare fare1=far.get();
		//fare1.setStatus(r.getStatus());
		return farerepository.save(fare1);
	}
}
