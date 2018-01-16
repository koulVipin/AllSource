package com.vipin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class User {
	
	@Id
	@Column(name="SSNID")
	private int ssnID;
	@Column(name="FULLNAME")
	private String fullName;
	@Column(name="CITY")
	private String city;
	
	public int getSsnID() {
		return ssnID;
	}
	public void setSsnID(int ssnID) {
		this.ssnID = ssnID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "User [ssnID=" + ssnID + ", fullName=" + fullName + ", city=" + city + "]";
	}
}