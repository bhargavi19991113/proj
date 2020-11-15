package com.flightbookingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")
public class Passenger {
	
	@Id
	@Column(name="passenger_id")
	int id;
	@Column(name="firt_name")
	String firstName;
	@Column(name="last_name")
	String lastName;
	@Column(name="age")
	int age;
	@Column(name="gender")
	char gender;
	@Column(name="passport_number")
	String passportNo;
	@Column(name="meal_preference")
	String mealPref;
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(int id, String firstName, String lastName, int age, char gender, String passportNumber,
			String mealPref) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.passportNo = passportNumber;
		this.mealPref = mealPref;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", passportNumber=" + passportNo + ", mealPref=" + mealPref + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + gender;
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mealPref == null) ? 0 : mealPref.hashCode());
		result = prime * result + ((passportNo == null) ? 0 : passportNo.hashCode());
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
		Passenger other = (Passenger) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mealPref == null) {
			if (other.mealPref != null)
				return false;
		} else if (!mealPref.equals(other.mealPref))
			return false;
		if (passportNo == null) {
			if (other.passportNo != null)
				return false;
		} else if (!passportNo.equals(other.passportNo))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPassportNumber() {
		return passportNo;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNo = passportNumber;
	}
	public String getMealPref() {
		return mealPref;
	}
	public void setMealPref(String mealPref) {
		this.mealPref = mealPref;
	}
	
	
	

}
