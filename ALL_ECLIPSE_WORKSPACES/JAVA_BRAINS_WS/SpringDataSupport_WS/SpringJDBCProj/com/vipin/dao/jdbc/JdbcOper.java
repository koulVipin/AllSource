package com.vipin.dao.jdbc;

import java.sql.SQLException;

public interface JdbcOper {
	
	public void executeSelect() throws SQLException; // This method based on pure JDBC style; note the Checked-exception.
	
	public int getUserCount();
	
	public void getUserBasedOnIdUsingJdbcTemplate(int ssnID); // based on JdbcTemplate
	
	public void executeSelectUsingJdbcTemplate(); // Based in JdbcTemplate
	
	public void getUserBasedOnIdUsingNamedParameterJdbcTemplate(String ssnID);  // Based in NameParameterJdbcTemplate
}