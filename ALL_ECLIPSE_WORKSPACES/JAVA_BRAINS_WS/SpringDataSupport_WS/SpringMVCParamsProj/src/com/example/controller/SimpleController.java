package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.StudentDetails;

@Controller
public class SimpleController {

	@RequestMapping(value="/admission.html", method=RequestMethod.GET)
	ModelAndView getAdmissionForm() {
		
		ModelAndView mw = new ModelAndView("AdmissionForm");
		return mw;
	}	
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST, params = {"studentName", "submitTheForm"})
	ModelAndView submitAdmissionForm(@ModelAttribute("studentDetailsKey") StudentDetails student, BindingResult result, HttpServletRequest req) {
		
		
		System.out.println(req.getParameter("studentName"));
		System.out.println();
		
		System.out.println(req.getParameter("submitTheForm"));
		System.out.println();
		
		
		System.out.println("Will i get called ?");
		if(result.hasErrors()) {
			return new ModelAndView("AdmissionForm");
		}
		
		ModelAndView mw = new ModelAndView("AdmissionSuccess");
		return mw;
	}
	
	@ModelAttribute
	public void commonText(Model model) {
		model.addAttribute("commonTextKey", "Indian Institute of Technology, Kanpur");
	}
}