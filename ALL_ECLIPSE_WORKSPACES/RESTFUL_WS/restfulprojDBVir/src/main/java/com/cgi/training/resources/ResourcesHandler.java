package com.cgi.training.resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgi.training.model.User;

@Path("/users")
public class ResourcesHandler {
	
	private static final String JDBC_DRIVER = "org.h2.Driver";
	
	private static final String DB_URL = "jdbc:h2:tcp://inprj-lisa01.groupinfra.com:7777/~/test";
	
	//Database credentials
	static final String USER = "sa";
	static final String PASS = "";
	
	private Connection conn = null;
	private Statement stmt = null;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{ssnID}")
	public String userInfo(@PathParam("ssnID") String ssnID) throws ClassNotFoundException, SQLException {
		User user = null;
		Class.forName(JDBC_DRIVER);
		String sql;
		sql = "SELECT * from User where ssnId = " + ssnID;
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		if(!rs.isBeforeFirst()) {
			return "No matching value";
		}
		while(rs.next()){
			String ssnId  = rs.getString("ssnID");
			String fullName = rs.getString("fullName");
			String city = rs.getString("city");
			user = new User();
			user.setSsnID(ssnId);
			user.setFullName(fullName);
			user.setCity(city);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		return user.toString();
	}
}