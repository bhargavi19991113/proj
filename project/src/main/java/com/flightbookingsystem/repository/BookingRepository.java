package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{
}
