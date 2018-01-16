package com.vipin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		final String JDBC_DRIVER = "org.h2.Driver";
		//final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
		//final String DB_URL = "jdbc:h2:tcp://localhost:9092/~/test";
		final String DB_URL = "jdbc:h2:tcp://localhost:7777/~/test";
		
		//Database credentials
		final String USER = "sa";
		final String PASS = "";
		
		Connection conn = null;
		Statement stmt = null;
		
		Class.forName(JDBC_DRIVER);
		String sql;
		sql = "SELECT * from User"; 
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
        	String ssnId  = rs.getString("ssnID");
			String fullName = rs.getString("fullName");
			String city = rs.getString("city");
			
			System.out.println("ssndID is " + ssnId + " fullName is " + fullName +" city is" + city);
		}	
	}
}
