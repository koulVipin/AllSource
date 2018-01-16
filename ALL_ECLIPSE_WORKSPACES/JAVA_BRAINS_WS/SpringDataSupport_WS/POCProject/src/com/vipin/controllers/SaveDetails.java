package com.vipin.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SaveDetails extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String emailAddress = req.getParameter("emailId");
		String addressLine = req.getParameter("addressLine1");
		
		System.out.println("The values entered by the user are");
		
		System.out.println("firstName = " + firstName + " lastName is = " + lastName + " emailAddress is = " + emailAddress + " addressLine1 is = "+ addressLine);
	
		ModelAndView mw = new ModelAndView("success");
		
		System.out.println("The name of the view is " + mw.getViewName());
		System.out.println("The name of the mode is " + mw.getModel().toString());
		return mw;
	}
}
