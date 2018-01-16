package com.vipin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@Entity
public class Student implements Serializable {
	
	private static final long serialVersionUID = -6233899046964701573L;
	
	//Composite primary key: firstName and lastName
	@Id
	private String firstName;
	@Id
	private String lastName;
	
	//Composite foreign key: clazz, section, rollNum from Entity StudentReport
	@OneToOne
	@JoinColumns({
		  @JoinColumn(name = "clazz"),
		  @JoinColumn(name = "section"),
		  @JoinColumn(name = "rollNum")
		})
	private StudentReport studentReport;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public StudentReport getStudentReport() {
		return studentReport;
	}

	public void setStudentReport(StudentReport studentReport) {
		this.studentReport = studentReport;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentReport=" + studentReport + "]";
	}
}
