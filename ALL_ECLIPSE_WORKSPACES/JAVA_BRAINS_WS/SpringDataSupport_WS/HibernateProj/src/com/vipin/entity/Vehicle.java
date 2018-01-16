package com.vipin.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {

	@EmbeddedId
	private VehicleID vehicleID; // This is composite primary key, need to see how this is mapped as foreign-key
	private String description;
	
	@OneToOne(mappedBy="veh")
	private UserInfo userInfo;
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public VehicleID getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(VehicleID vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
