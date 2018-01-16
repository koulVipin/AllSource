package com.vipin.main;

import java.sql.SQLException;

import com.vipin.dao.jdbc.JdbcOper;
import com.vipin.dao.jdbc.impl.JdbcOperImpl;

public class MainApp {

	public static void main(String s[]) throws ClassNotFoundException, SQLException {
		
		JdbcOper jdbcOper = new JdbcOperImpl();
		jdbcOper.executeSelect();
		System.out.println();
	}
}