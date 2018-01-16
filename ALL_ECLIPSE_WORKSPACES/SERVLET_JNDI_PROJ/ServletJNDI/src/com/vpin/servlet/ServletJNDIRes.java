package com.vpin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/servletjndires")
public class ServletJNDIRes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/UsersDB")
    private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
            PrintWriter writer = response.getWriter();
        try {
            
            Connection conn = dataSource.getConnection();
             
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM USER";
            ResultSet rs = statement.executeQuery(sql);
             
            int count = 1;
            while (rs.next()) {
            	String ssnId  = rs.getString("ssnID");
    			String fullName = rs.getString("fullName");
    			String city = rs.getString("city");
    			
    			writer.println("ssndID is " + ssnId + " fullName is " + fullName +" city is" + city);
    			
                 
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
