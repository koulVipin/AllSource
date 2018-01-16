package com.vipin.dao.jdbc.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.vipin.model.User;
import com.vipin.dao.jdbc.JdbcOper;
import com.vipin.dao.rowmapper.UserRowMapper;

@Component
public class JdbcOperImpl implements JdbcOper {

	private static Connection connection = null;
	private static Statement statement = null;
	private ResultSet resultSet = null;
	
	@Resource(name="dataSource")
	private DataSource dataSouce;
	
	/*private JdbcTemplate jdbcTemplate = new JdbcTemplate();*/ // Replaced with the injection
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	//@Resource(name="namedParameterJdbcTemplate")
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public DataSource getDataSouce() {
		return dataSouce;
	}

	public void setDataSouce(DataSource dataSouce) {
		this.dataSouce = dataSouce;
	}
	
	@Override
	public void executeSelect() throws SQLException {
		
		String sql = null;
		User user = new User();
		sql = "Select * from USER";
		
		connection= dataSouce.getConnection();
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
	
	@Override
	public int getUserCount() {
		int count = 0;
		String sql = "Select count(*) from User";
		//jdbcTemplate.setDataSource(getDataSouce()); // Will the @Resource work?
		count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public void getUserBasedOnIdUsingJdbcTemplate(int ssnID) {
		
		User user = null;
		String sql = "Select * from USER where ssnID = ?";
		Integer argsToQueryForObject[] = new Integer[1]; // Array with One element only.
		argsToQueryForObject[0] = 1;
		user = jdbcTemplate.queryForObject(sql, argsToQueryForObject, new UserRowMapper());  // This might give runTime exception :)
		//user = jdbcTemplate.queryForObject(sql, new Object[] {1}, rowMapper);
		System.out.println("The User details are ---> ");
		System.out.println(user.toString());
		System.out.println();
	}

	@Override
	public void executeSelectUsingJdbcTemplate() {
		String sql = "Select * from USER";
		List<User> users = null;
		//users = jdbcTemplate.queryForList(sql, User.class);
		users = jdbcTemplate.query(sql, new UserRowMapper());
		for(User user:users) {
			System.out.println(user.toString());
		}
	}

	@Override
	public void getUserBasedOnIdUsingNamedParameterJdbcTemplate(String ssnID) {
		User user = null;
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("ssnID", ssnID);
		paramMap.put("xxx", ssnID);
		
		String sql = "Select * from USER where ssnID = :ssnID";
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource(paramMap);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSouce);
		user = namedParameterJdbcTemplate.queryForObject(sql, sqlParameterSource, new UserRowMapper());
		//user = namedParameterJdbcTemplate.queryForObject(sql, paramMap, new UserRowMapper());
		System.out.println(user.toString());	
	}
}