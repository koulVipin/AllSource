package com.vipin.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vipin.dao.jdbc.JdbcOper;

public class MainApp {

	public static void main(String s[]) throws ClassNotFoundException, SQLException {
		
		JdbcOper jdbcOper = null;
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
		jdbcOper = (JdbcOper) appContext.getBean("jdbcOperImpl");
		//jdbcOper.executeSelect();
		System.out.println();
		
		/*int user_count = jdbcOper.getUserCount();
		
		System.out.println("User count is " + user_count);
		
		jdbcOper.getUserBasedOnIdUsingJdbcTemplate(1);*/
		
		//jdbcOper.executeSelectUsingJdbcTemplate();
		
		jdbcOper.getUserBasedOnIdUsingNamedParameterJdbcTemplate("6");
	}
}