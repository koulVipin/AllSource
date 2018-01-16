package com.vipin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_OWNER_DETAILS")
public class VehicleOwner {
	
	@Id
	@Column(name="SSNID")
	private int ssnID;
	private String ownerName;
	
	@OneToOne
	@JoinColumn(name="vehicleRegistrationNum")
	private VehicleDetails vehicleDetails;

	public int getSsnID() {
		return ssnID;
	}

	public void setSsnID(int ssnID) {
		this.ssnID = ssnID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	
}