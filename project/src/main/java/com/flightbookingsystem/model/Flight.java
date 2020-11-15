package com.flightbookingsystem.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Flight_Master")
public class Flight {
	@Id
	@Column(name="flight_id")
	int id;
	@Column(name="departure_time")
	Date departureTime;//Date
	@Column(name="arrival_time")
	Date arrivalTime;//Date
	@Column(name="departure_loc")
	String departureLocation;
	@Column(name="arrival_loc")
	String arrivalLocation;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="fleet_master_id")
	Fleet fleet;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="flight_status_id")
	FlightSeatStatus status;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, Date departureTime, Date arrivalTime, String departureLocation, String arrivalLocation,
			Fleet fleet, FlightSeatStatus status) {
		super();
		this.id = id;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.fleet = fleet;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation + ", fleet="
				+ fleet + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalLocation == null) ? 0 : arrivalLocation.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((departureLocation == null) ? 0 : departureLocation.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((fleet == null) ? 0 : fleet.hashCode());
		result = prime * result + id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Flight other = (Flight) obj;
		if (arrivalLocation == null) {
			if (other.arrivalLocation != null)
				return false;
		} else if (!arrivalLocation.equals(other.arrivalLocation))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (departureLocation == null) {
			if (other.departureLocation != null)
				return false;
		} else if (!departureLocation.equals(other.departureLocation))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (fleet == null) {
			if (other.fleet != null)
				return false;
		} else if (!fleet.equals(other.fleet))
			return false;
		if (id != other.id)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public Fleet getFleet() {
		return fleet;
	}
	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}
	public FlightSeatStatus getStatus() {
		return status;
	}
	public void setStatus(FlightSeatStatus status) {
		this.status = status;
	}
	
	
	

}
