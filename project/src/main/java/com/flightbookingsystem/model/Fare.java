package com.flightbookingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fare_Master")
public class Fare {

	 @Id
	 @Column(name="fare_id")
	 int id;
	 @Column(name="economy_class")
     double economyFare;
	 @Column(name="premium_class")
     double premiumFare;
	 @Column(name="business_class")
     double businessFare;
     
     public Fare() {
	super();
	// TODO Auto-generated constructor stub
     }
public Fare(int id, double economyFare, double premiumFare, double businessFare) {
	super();
	this.id = id;
	this.economyFare = economyFare;
	this.premiumFare = premiumFare;
	this.businessFare = businessFare;
}
@Override
public String toString() {
	return "Fare [id=" + id + ", economyFare=" + economyFare + ", premiumFare=" + premiumFare + ", businessFare="
			+ businessFare + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(businessFare);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(economyFare);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + id;
	temp = Double.doubleToLongBits(premiumFare);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Fare other = (Fare) obj;
	if (Double.doubleToLongBits(businessFare) != Double.doubleToLongBits(other.businessFare))
		return false;
	if (Double.doubleToLongBits(economyFare) != Double.doubleToLongBits(other.economyFare))
		return false;
	if (id != other.id)
		return false;
	if (Double.doubleToLongBits(premiumFare) != Double.doubleToLongBits(other.premiumFare))
		return false;
	return true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getEconomyFare() {
	return economyFare;
}
public void setEconomyFare(double economyFare) {
	this.economyFare = economyFare;
}
public double getPremiumFare() {
	return premiumFare;
}
public void setPremiumFare(double premiumFare) {
	this.premiumFare = premiumFare;
}
public double getBusinessFare() {
	return businessFare;
}
public void setBusinessFare(double businessFare) {
	this.businessFare = businessFare;
}


}
