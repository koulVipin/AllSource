package com.vipin.dao.jdbc.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vipin.model.User;
import com.vipin.dao.jdbc.JdbcOper;

public class JdbcOperImpl implements JdbcOper {

	private static Connection connection = null;
	private static Statement statement = null;
	private ResultSet resultSet = null;
	
	private String DB_USER = "sa";
	private String DB_PASSWD = "";
	
	private String DB_URL = "jdbc:h2:tcp://localhost/~/test";
	private String JDBC_DRIVER="org.h2.Driver";
	
	public JdbcOperImpl() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
	}
	
	@Override
	public void executeSelect() throws SQLException {
		String sql = null;
		User user = new User();
		sql = "Select * from USER";
		
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		
		if(!resultSet.isBeforeFirst()) {
			System.out.println("No matching value");
		}
		
		while(resultSet.next()){
			String ssnId  = resultSet.getString("ssnID");
			String fullName = resultSet.getString("fullName");
			String city = resultSet.getString("city");
			user.setSsnID(ssnId);
			user.setFullName(fullName);
			user.setCity(city);
			System.out.println(user.toString());
			System.out.println();
		}
	}
}