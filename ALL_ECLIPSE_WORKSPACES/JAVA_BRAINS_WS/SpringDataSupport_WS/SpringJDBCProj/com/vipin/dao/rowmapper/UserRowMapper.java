package com.vipin.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vipin.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("rowNum is " + rowNum);

		User user = new User();
		
		user.setSsnID(rs.getString("SSNID"));
		user.setFullName(rs.getString("FULLNAME"));
		user.setCity(rs.getString("CITY"));
		
		return user;
	}
}