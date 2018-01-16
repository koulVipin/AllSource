package com.vipin.main;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vipin.model.User;
import com.vipin.service.DBServices;

public class MainApp {

	public static void main(String s[]) {
		
		DBServices dBServices = null;
		User user = new User();
		
		user.setSsnID(1);
		user.setCity("Blr");
		user.setFullName("Full name");
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
		dBServices = (DBServices) appContext.getBean("DBServices");
		
		dBServices.saveUser(user);
		
		// Hibernate API's. Do we have any JPA Hibernate API's :-)
		/*SessionFactory sf = null;
		Session session;
		session = sf.openSession();*/
	}
}