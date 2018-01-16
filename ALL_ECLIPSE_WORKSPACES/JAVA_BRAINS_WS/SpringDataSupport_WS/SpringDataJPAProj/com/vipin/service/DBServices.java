package com.vipin.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vipin.jpa.JPADBAccess;
import com.vipin.model.User;

@Service
public class DBServices {

	@Autowired(required=true)
	private JPADBAccess jPADBAccess;  // How does this work??
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_UNCOMMITTED, timeout=90)
	public void saveUser(User user) {
		
		User queriedUser = null;
		jPADBAccess.save(user);
		
		queriedUser = jPADBAccess.findOne(1);
		System.out.println(queriedUser.toString());
	}
}