package com.vipin.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String addressLine1;
	private String pinCode;
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}