package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.model.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {


}
