package com.flightbookingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fleet_Master")
public class Fleet {
	@Id
	@Column(name="fleet_master_id")
	int id;
	@Column(name="code")
	String code;
	@Column(name="model")
	String model;
	@Column(name="total_economy_seats")
	int totalEconomySeats;
	@Column(name="total_premium_seats")
	int totalPremiumSeats;
	@Column(name="total_business_seats")
	int totalBusinessSeats;
	public Fleet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fleet(int id, String code, String model, int totalEconomySeats, int totalPremiumSeats,
			int totalBusinessSeats) {
		super();
		this.id = id;
		this.code = code;
		this.model = model;
		this.totalEconomySeats = totalEconomySeats;
		this.totalPremiumSeats = totalPremiumSeats;
		this.totalBusinessSeats = totalBusinessSeats;
	}
	@Override
	public String toString() {
		return "Fleet [id=" + id + ", code=" + code + ", model=" + model + ", totalEconomySeats=" + totalEconomySeats
				+ ", totalPremiumSeats=" + totalPremiumSeats + ", totalBusinessSeats=" + totalBusinessSeats + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + id;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + totalBusinessSeats;
		result = prime * result + totalEconomySeats;
		result = prime * result + totalPremiumSeats;
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
		Fleet other = (Fleet) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id != other.id)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (totalBusinessSeats != other.totalBusinessSeats)
			return false;
		if (totalEconomySeats != other.totalEconomySeats)
			return false;
		if (totalPremiumSeats != other.totalPremiumSeats)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getTotalEconomySeats() {
		return totalEconomySeats;
	}
	public void setTotalEconomySeats(int totalEconomySeats) {
		this.totalEconomySeats = totalEconomySeats;
	}
	public int getTotalPremiumSeats() {
		return totalPremiumSeats;
	}
	public void setTotalPremiumSeats(int totalPremiumSeats) {
		this.totalPremiumSeats = totalPremiumSeats;
	}
	public int getTotalBusinessSeats() {
		return totalBusinessSeats;
	}
	public void setTotalBusinessSeats(int totalBusinessSeats) {
		this.totalBusinessSeats = totalBusinessSeats;
	}
	
	

}
