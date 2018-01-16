package com.example.model;

import java.util.Date;

public class StudentDetails {
	
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