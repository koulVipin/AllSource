package com.vipin.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vipin.model.Student;
import com.vipin.model.StudentReport;
import com.vipin.model.VehicleDetails;
import com.vipin.model.VehicleOwner;

public class MainApp {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		
		entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
		
		System.out.println(entityManagerFactory.isOpen());
		
		VehicleDetails vehicleDetails = new VehicleDetails();
		vehicleDetails.setVehicleMake("Hyundai");
		vehicleDetails.setVehicleName("Accent");
		vehicleDetails.setVehicleRegistrationNum("KA03MJ5616");
		
		VehicleOwner vehicleOwner = new VehicleOwner();
		vehicleOwner.setVehicleDetails(vehicleDetails);
		vehicleOwner.setSsnID(6);
		vehicleOwner.setOwnerName("VIPIN KOUL");
		
		
		StudentReport studentReport = new StudentReport();
		studentReport.setAttendence("75");
		studentReport.setClazz("12");
		studentReport.setGrade("A+");
		studentReport.setRollNum(6);
		studentReport.setSection("A");
		studentReport.setSemester("6");
		
		Student  student = new Student();
		student.setFirstName("VIPIN");
		student.setLastName("KOUL");
		student.setStudentReport(studentReport);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(vehicleOwner);
		entityManager.persist(vehicleDetails);
		
		entityManager.persist(student);
		entityManager.persist(studentReport);
		
		transaction.commit();
		entityManagerFactory.close();		
	}
}