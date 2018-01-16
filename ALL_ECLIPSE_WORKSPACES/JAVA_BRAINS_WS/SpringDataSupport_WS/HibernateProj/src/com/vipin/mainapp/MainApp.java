package com.vipin.mainapp;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;

import com.vipin.entity.Address;
import com.vipin.entity.UserID;
import com.vipin.entity.UserInfo;
import com.vipin.entity.Vehicle;
import com.vipin.entity.VehicleID;
import com.vipin.service.ServiceMethods;
import com.vipin.value.type.Dummy;

public class MainApp {

	public static void main(String s[]) {
		
		ServiceMethods sms = new ServiceMethods();
		/*Address home_address = new Address();
		Address office_address = new Address();*/
		UserID userID = new UserID();
		
		/*home_address.setAddressLine1("First address line");
		home_address.setPinCode("110001");
		
		office_address.setAddressLine1("First address line for office");
		office_address.setPinCode("111111");*/
		
		/*Address address1 = new Address();
		Address address2 = new Address();
		Address address3 = new Address();
		
		address1.setAddressLine1("First address");
		address1.setPinCode("190001");
		
		address2.setAddressLine1("Second address");
		address2.setPinCode("190002");
		
		address3.setAddressLine1("Third address");
		address3.setPinCode("190003");
		
		Set<Address> addressSet = new HashSet<Address>();
		
		addressSet.add(address1);
		addressSet.add(address2);
		addressSet.add(address3);*/
		
		UserInfo ui = new UserInfo();
		
		userID.setSsnID(100); // Object which acts as primary key, that is, composite-primary key.
		userID.setUniqueNum(100);
		
		ui.setUserID(userID);
		ui.setFull_name("Vipin Koul");
		
		//------------------------------------------------- START: For 1:M relationship demo----------------
		/*Vehicle veh1 = new Vehicle();
		veh1.setVehicleID(100);
		veh1.setDescription("Vehicle with ID --> 100");
		
		Vehicle veh2 = new Vehicle();
		veh2.setVehicleID(200);
		veh2.setDescription("Vehicle with ID -->200");
		
		Collection<Vehicle> vehColl = new HashSet<>();
		
		vehColl.add(veh1);
		vehColl.add(veh2);
		ui.setVehicles(vehColl);*/
		//------------------------------------------------- END: For 1:M relationship demo---------------------	
		
		//-------------------START: For ONE-TO-ONE relationship learning---------------------------------------
		Vehicle veh = new Vehicle();
		
		VehicleID vehicleID = new VehicleID();  // VehicleID acts as composite primary-key for Vehicle Entity.
		
		vehicleID.setVehicleID(600);
		vehicleID.setRegNum(606);
		
		veh.setVehicleID(vehicleID);
		veh.setDescription("Vehicle with ID --> 100");
		
		ui.setVeh(veh);
		//-------------------END: For ONE-TO-ONE relationship learning------------------------------------------	
		
		/*ui.getAddressList().add(address1);
		ui.getAddressList().add(address2);
		ui.getAddressList().add(address3);*/
		
		/*ui.setHome_address(home_address);
		ui.setOffice_address(office_address);*/
		
		sms.saveUser(ui);
		
		UserInfo userInfo = sms.getUser(userID);
		System.out.println(userInfo.toString());
	}
}