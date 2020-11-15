package com.flightbookingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight_seat_status")
public class FlightSeatStatus {
    @Id
    @Column(name="flight_status_id")
	int id;
    @Column(name="remaining_economy_seats")
	int remainingEconomySeats;
    @Column(name="remaining_premium_seats")
	int remainingPremiumSeats;
    @Column(name="remaining_business_seats")
	int remainingBusinessSeats;
	
	public FlightSeatStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FlightSeatStatus(int id, int remainingEconomySeats, int remainingPremiumSeats, int remainingBusinessSeats) {
		super();
		this.id = id;
		this.remainingEconomySeats = remainingEconomySeats;
		this.remainingPremiumSeats = remainingPremiumSeats;
		this.remainingBusinessSeats = remainingBusinessSeats;
	}
	
	
	@Override
	public String toString() {
		return "FlightSeatStatus [id=" + id + ", remainingEconomySeats=" + remainingEconomySeats
				+ ", remainingPremiumSeats=" + remainingPremiumSeats + ", remainingBusinessSeats="
				+ remainingBusinessSeats + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + remainingBusinessSeats;
		result = prime * result + remainingEconomySeats;
		result = prime * result + remainingPremiumSeats;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightSeatStatus other = (FlightSeatStatus) obj;
		if (id != other.id)
			return false;
		if (remainingBusinessSeats != other.remainingBusinessSeats)
			return false;
		if (remainingEconomySeats != other.remainingEconomySeats)
			return false;
		if (remainingPremiumSeats != other.remainingPremiumSeats)
			return false;
		return true;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRemainingEconomySeats() {
		return remainingEconomySeats;
	}
	public void setRemainingEconomySeats(int remainingEconomySeats) {
		this.remainingEconomySeats = remainingEconomySeats;
	}
	public int getRemainingPremiumSeats() {
		return remainingPremiumSeats;
	}
	public void setRemainingPremiumSeats(int remainingPremiumSeats) {
		this.remainingPremiumSeats = remainingPremiumSeats;
	}
	public int getRemainingBusinessSeats() {
		return remainingBusinessSeats;
	}
	public void setRemainingBusinessSeats(int remainingBusinessSeats) {
		this.remainingBusinessSeats = remainingBusinessSeats;
	}
	

	
	
}
