package com.flightbookingsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact_details")
public class Contact {
    @Id
    @Column(name="contact_id")
	int id;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(referencedColumnName="address_id")
	Address address;
    @Column(name="email_address")
	String email;
    @Column(name="mobile_number")
	long mobileNo;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int id, Address address, String email, long mobileNo) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", address=" + address + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + (int) (mobileNo ^ (mobileNo >>> 32));
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
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (mobileNo != other.mobileNo)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
