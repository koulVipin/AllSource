package com.vipin.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.vipin.entity.Vehicle;

@Entity
//@Table(name="USER_DETAILS")
public class UserInfo {

	//@Column(name="FULLNAME")
	private String full_name;
	
	@EmbeddedId
	UserID userID; // Object which acts as a primary key (composite primary key)
	
	/*@ElementCollection
	Set<Address> addressList = new HashSet<Address>();*/ // In OO terms, it is Association(either Aggregation or Composition) between these objects	
	
	// Code to demonstrate the relationship between tables, in this case 1:M
	//------------------------------------------------- START: For 1:M relationship demo----------------
	/*@OneToMany
	Collection<Vehicle> vehicles; = new HashSet<>();
	
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}*/
	//------------------------------------------------- END: For 1:M relationship demo---------------------
	
	
		
	//-------------------START: For ONE-TO-ONE relationship learning---------------------------------------
	@OneToOne(cascade=CascadeType.ALL)  // If we don't specify the Cascade type, then we explicity save the Vehicle entity
	
	@JoinColumns({@JoinColumn(name="XYZ_ID", referencedColumnName="vehicleID") , @JoinColumn(name="ABC_Num", referencedColumnName="regNum")})
	//@JoinColumns({@JoinColumn(name="vehicle_ID") , @JoinColumn(name="reg_Num")}) // Composite primary key in Vehicle
	Vehicle veh;
	
	public Vehicle getVeh() {
		return veh;
	}

	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}
	
	//-------------------END: For ONE-TO-ONE relationship learning------------------------------------------
	
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(name = "addressLine1", column = @Column(name = "HOME_ADDRESSLINE1")),
	@AttributeOverride(name = "pinCode", column = @Column(name = "HOME_PINCODE"))
	})
	private Address home_address;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name = "addressLine1", column = @Column(name = "OFFICE_ADDRESSLINE1")),
	@AttributeOverride(name = "pinCode", column = @Column(name = "OFFICE_PINCODE"))
	})
	private Address office_address;*/

	public UserID getUserID() {
		return userID;
	}
	
	public void setUserID(UserID userID) {
		this.userID = userID;
	}
	
	/*public Set<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}*/
	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	/*public Address getHome_address() {
		return home_address;
	}
	public void setHome_address(Address home_address) {
		this.home_address = home_address;
	}
	public Address getOffice_address() {
		return office_address;
	}
	public void setOffice_address(Address office_address) {
		this.office_address = office_address;
	}
	@Override
	public String toString() {
		return "UserInfo [userID=" + userID + ", full_name=" + full_name + ", city_loc=" + city_loc + ", home_address="
				+ home_address + ", office_address=" + office_address + "]";
	}*/
}