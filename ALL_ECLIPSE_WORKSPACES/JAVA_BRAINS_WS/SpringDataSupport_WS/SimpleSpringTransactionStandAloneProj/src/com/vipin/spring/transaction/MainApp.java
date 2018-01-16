package com.vipin.spring.transaction;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

public class MainApp {

	private static PlatformTransactionManager ptm;
	
	public static void main(String[] args) {

		DataSourceTransactionManager dtm = new DataSourceTransactionManager();
		dtm.setDataSource(null);
		
		ptm = dtm;
		
	}
}
