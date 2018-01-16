package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	@RequestMapping(value="/admission.html", method=RequestMethod.GET)
	ModelAndView getAdmissionForm() {
		
		ModelAndView mw = new ModelAndView("AdmissionForm");
		return mw;
	}	
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST		)
	//ModelAndView submitAdmissionForm(@RequestParam("studentName") String student_Name, @RequestParam("studentHobby") String student_Hobby) {
	ModelAndView submitAdmissionForm(@RequestParam Map<String , String> reqParam) {
		
		String student_name = reqParam.get("studentName");
		String student_hobby = reqParam.get("studentHobby");
		
		ModelAndView mw = new ModelAndView("AdmissionSuccess", "studentDetailsKey","Students details are.. Name : " +student_name + " , hobby: " + student_hobby);
		return mw;
	}
}