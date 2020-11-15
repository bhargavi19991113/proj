package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.model.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare,Integer> {

}
