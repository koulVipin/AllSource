package com.vipin.model;

public class User {

	private String ssnID;
	private String fullName;
	private String city;
	
	public String getSsnID() {
		return ssnID;
	}
	public void setSsnID(String ssnID) {
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
