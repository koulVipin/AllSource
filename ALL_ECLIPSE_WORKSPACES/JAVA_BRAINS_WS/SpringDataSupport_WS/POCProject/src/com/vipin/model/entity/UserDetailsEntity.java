package com.vipin.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.DispatcherServlet;

@Entity
@Table(name="USER_DETAILS")
public class UserDetailsEntity {
	
	@Id
	String emailId;
	String firstName;
	String lastName;
	String addressLine1;
	
	BeanFactory bf;
	ApplicationContext appCtx;
	ContextLoader ctxLoader;
	
	DispatcherServlet ds;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
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
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	@Override
	public String toString() {
		return "UserDetailsEntity [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", addressLine1=" + addressLine1 + "]";
	}
}