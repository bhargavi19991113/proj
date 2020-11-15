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
@Table(name="Booking")
public class Booking {
@Id
@Column(name="booking_id")
int id;
@Column(name="booking_number")
long bookingNumber;
@Column(name="booking_date")
Date bookingDate;
@Column(name="travel_date")
Date travelDate;
@Column(name="total_cost")
double totalCost;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(referencedColumnName="flight_id")
Flight flightBooked;
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public Booking(int id, long bookingNumber, Date bookingDate, Date travelDate, double totalCost, Flight flightBooked) {
	super();
	this.id = id;
	this.bookingNumber = bookingNumber;
	this.bookingDate = bookingDate;
	this.travelDate = travelDate;
	this.totalCost = totalCost;
	this.flightBooked = flightBooked;
}
@Override
public String toString() {
	return "Booking [id=" + id + ", bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate + ", travelDate="
			+ travelDate + ", totalCost=" + totalCost + ", flightBooked=" + flightBooked + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
	result = prime * result + (int) (bookingNumber ^ (bookingNumber >>> 32));
	result = prime * result + ((flightBooked == null) ? 0 : flightBooked.hashCode());
	result = prime * result + id;
	long temp;
	temp = Double.doubleToLongBits(totalCost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((travelDate == null) ? 0 : travelDate.hashCode());
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
	Booking other = (Booking) obj;
	if (bookingDate == null) {
		if (other.bookingDate != null)
			return false;
	} else if (!bookingDate.equals(other.bookingDate))
		return false;
	if (bookingNumber != other.bookingNumber)
		return false;
	if (flightBooked == null) {
		if (other.flightBooked != null)
			return false;
	} else if (!flightBooked.equals(other.flightBooked))
		return false;
	if (id != other.id)
		return false;
	if (Double.doubleToLongBits(totalCost) != Double.doubleToLongBits(other.totalCost))
		return false;
	if (travelDate == null) {
		if (other.travelDate != null)
			return false;
	} else if (!travelDate.equals(other.travelDate))
		return false;
	return true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getBookingNumber() {
	return bookingNumber;
}
public void setBookingNumber(long bookingNumber) {
	this.bookingNumber = bookingNumber;
}
public Date getBookingDate() {
	return bookingDate;
}
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
public Date getTravelDate() {
	return travelDate;
}
public void setTravelDate(Date travelDate) {
	this.travelDate = travelDate;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public Flight getFlightBooked() {
	return flightBooked;
}
public void setFlightBooked(Flight flightBooked) {
	this.flightBooked = flightBooked;
}


}
