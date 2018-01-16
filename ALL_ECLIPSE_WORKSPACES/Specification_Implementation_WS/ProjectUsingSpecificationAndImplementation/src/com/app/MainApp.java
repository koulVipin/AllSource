package com.app;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.specification.common.CommonTasks;  // The interface from the specification
import com.specification.simple.SimpleTasks;  // The interface from the specification

//import in.vevaan.common.impl.CommomImpl;    //The class which implements the specification
//import in.vevaan.simple.impl.SimpleImpl;    //The class which implements the specification 

public class MainApp {

	/*@Resource(name = "SimpleImpl")
	static SimpleTasks simpleTasks1;*/
	
	public static void main(String[] args) {
		
		//simpleTasks1.print("VIPIN");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-config.xml");
		
		SimpleTasks simpleTasks = null;
		CommonTasks commonTasks = null;
		
		simpleTasks = (SimpleTasks) context.getBean("SimpleImpl");
		simpleTasks.print("VIPIN");
		
		commonTasks = (CommonTasks) context.getBean("CommomImpl");
		commonTasks.add(3,3);
		
		
		/*SimpleTasks simpleImpl = new SimpleImpl();
		simpleImpl.print("VIPIN");
		
		CommonTasks commonTasks = new CommomImpl();
		commonTasks.add(3,3);*/
	}
}