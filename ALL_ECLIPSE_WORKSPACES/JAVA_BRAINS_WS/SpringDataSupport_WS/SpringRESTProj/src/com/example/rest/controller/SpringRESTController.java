package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController("/rest")
public class SpringRESTController {
	
	@RequestMapping(value="/user",method=RequestMethod.GET /*, produces = "application/json"*/)
	public String processRequest() {
		System.out.println("insisde the controller");
		User user = new User();
		user.setAge(24);
		user.setName("user 1");
		
		//ObjectMapper mapper = new ObjectMapper();
		//mapper.writeValue(new File("c://temp/employee.json"), user);
		//String jsonInString = mapper.writeValueAsString(user);
		//System.out.println(jsonInString);
		
		return "TEST";
		//return user;
	}
}