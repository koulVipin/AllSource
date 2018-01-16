package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.util.PrintUtil;

@Controller
public class SimpleController {

	@Autowired
	private PrintUtil printUtil;

	@RequestMapping("/welcome")
	ModelAndView handleIncomingWelcomeReq() {
		
		ModelAndView mw = new ModelAndView("WelcomePage","welcomeKey","WelcomeKey's value!");
		printUtil.print();
		return mw;
	}
	
	@RequestMapping("/hi")
	ModelAndView handleIncomingHiReq() {
		
		ModelAndView mw = new ModelAndView("HiPage","HiKey","HiKey's value!");
		return mw;
	}
	
	@RequestMapping(value="/{countryName}/{userName}", method=RequestMethod.GET)
	ModelAndView handleIncomingPathVariableAnnotationReq(@PathVariable Map<String, String> pathVars) {
		
		String countryName = pathVars.get("countryName");
		String userName = pathVars.get("userName");
		
		ModelAndView mw = new ModelAndView("PathVariableAnnotationReqPage","InputURIValues","Hello " + userName + " , you are from " + countryName);
		return mw;
	}	
}