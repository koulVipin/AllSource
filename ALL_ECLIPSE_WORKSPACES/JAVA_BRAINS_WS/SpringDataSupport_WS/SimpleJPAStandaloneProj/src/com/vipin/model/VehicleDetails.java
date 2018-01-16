package com.vipin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_DETAILS")
public class VehicleDetails {
	
	String vehicleRegistrationNum;
	@Id
	String vehicleMake;
	String vehicleName;
	public String getVehicleRegistrationNum() {
		return vehicleRegistrationNum;
	}
	
	public void setVehicleRegistrationNum(String vehicleRegistrationNum) {
		this.vehicleRegistrationNum = vehicleRegistrationNum;
	}
	public String getVehicleMake() {
		return vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}