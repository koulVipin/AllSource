package com.example.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.domain.User;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.setAge(24);
		user.setName("user 1");
		
		ObjectMapper mapper = new ObjectMapper();
		//mapper.writeValue(new File("c://temp/employee.json"), user);
		
		String jsonInString = mapper.writeValueAsString(user);
		System.out.println(jsonInString);
		
	}
}