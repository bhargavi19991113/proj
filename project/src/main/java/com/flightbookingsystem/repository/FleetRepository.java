package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.model.Fleet;

@Repository
public interface FleetRepository extends JpaRepository<Fleet,Integer> {

}
