package com.example.model;

import java.util.Date;

import javax.validation.constraints.Size;

public class StudentDetails {
	
	@Size(min=9, max=20, message="Please enter valid size for studentName between {min} and {max}")
	private String studentName;
	private String studentHobby;
	private Long studentMobileNumber;
	private Date studentDOB;
	private Address studentAddress;
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public Long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(Long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Inside setStudentName() method. size of studentName is " + studentName.length());
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentHobby=" + studentHobby + "]";
	}
}