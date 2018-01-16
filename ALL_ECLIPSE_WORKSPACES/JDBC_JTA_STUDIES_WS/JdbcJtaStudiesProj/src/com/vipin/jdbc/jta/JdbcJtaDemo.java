package com.vipin.jdbc.jta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcJtaDemo {

	static private Connection conn = null;
	static private Statement stmt = null;
	
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/test";
	
	//Database credentials
	static final String USER = "root";
	static final String PASS = "Abc123456#";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String ssnID = "1";
		ssnID = "9"; // For new row inserted
		Class.forName(JDBC_DRIVER);
		String sql;
		
		String sql_insert = null;
		sql_insert = "Insert into USER values ('9', 'User-9', 'loc-9')";
		
		String sql_delete = null;
		sql_delete = "Delete from USER where ssnId = " + "9";
		
		sql = "SELECT * from User where ssnId = " + ssnID;
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement();
		
		conn.setAutoCommit(false);
		ResultSet rs = stmt.executeQuery(sql);
		//stmt.execute(sql_insert);
		//rs = stmt.executeQuery(sql);
		
		stmt.executeUpdate(sql_delete);
		conn.commit();
		
		if(!rs.isBeforeFirst()) {
			System.out.println("No matching value");
		}
		while(rs.next()){
			String ssnId  = rs.getString("ssnID");
			String fullName = rs.getString("fullName");
			String city = rs.getString("city");	
			
			System.out.println("ssnId is  " + ssnId + " , fullName is " + fullName + " , city is " + city);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
