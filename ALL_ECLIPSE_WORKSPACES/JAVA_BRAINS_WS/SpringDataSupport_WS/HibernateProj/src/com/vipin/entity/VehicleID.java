package com.vipin.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class VehicleID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vehicleID;
	private int regNum;
	
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getRegNum() {
		return regNum;
	}
	public void setRegNum(int regNum) {
		this.regNum = regNum;
	}	
}
