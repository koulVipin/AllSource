package com.gontuseries.hellocontroller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.gontuseries.util.SimpleUtil;
 
public class HelloController extends AbstractController{
 
	//@Autowired(required=true)
	//@Qualifier(value="test")
	@Resource(name="simpleUtilImpl")
	private SimpleUtil simpleUtil;
	
	/*public HelloController() {

	}
	
	public HelloController(SimpleUtil simpleUtil) {
		System.out.println("Called constuctor, simpleUtil is " + simpleUtil);
		this.simpleUtil = simpleUtil;
	}*/
	
	/*public void setSimpleUtil(SimpleUtil simpleUtil) {
		System.out.println("setter called, simpleUtil is " + simpleUtil);
		this.simpleUtil = simpleUtil;
	}*/

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		System.out.println("calling the method add(a,b) ");
		
		simpleUtil.add(2, 3);
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
		
		return modelandview;
	}
}