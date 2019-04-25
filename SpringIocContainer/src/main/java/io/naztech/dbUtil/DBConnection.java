package io.naztech.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

import lombok.extern.slf4j.*;

@Slf4j
public class DBConnection {

	private static Connection conn;
	private static DBConnection instance=null;
	private static final String DB_URL = "jdbc:sqlserver://vNTDACWSSQLD002:1433;databaseName=DEV_TEST";
	//private static final String DB_NAME = "DEV_TEST";
	private static final String DB_USER = "dev_test_dbo";
	private static final String DB_PASS = "dev_test_dbo123";

	private DBConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL,DB_USER, DB_PASS);
			log.info("connection created.");
		} catch (Exception e) {
			log.info("connection Failed.- " +e.getMessage());
		}
	}
	public static DBConnection getInstance() {
		if(instance==null) {
			instance=new DBConnection();
		}
			return instance;
	}
	public Connection getConnection() {
		return conn;
		
	}
	
	public static void main(String[] args) {
		new  DBConnection();
	}
}
