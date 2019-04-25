package io.mtech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBConnection {
//	private static final Logger logger=LoggerFactory.getLogger(DBConnection.class);

	private static Connection conn;
	private static DBConnection instance=null;

	private DBConnection() {
		
		try {
			/*
			 * Class.forName("oracle.jdbc.OracleDriver"); conn =
			 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr",
			 * "mymy");
			 */
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://121.200.61.34:3341;"
						+ "databaseName=Maenul_DEV;user=maenul_dev_dbo;password=maenul_dev_dbo123;");
//						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123;");
//			  conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
//					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123;");
////					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
//			
//				Class.forName("net.sourceforge.jtds.jdbc.Driver");
//				conn = DriverManager.getConnection("jdbc:jtds:sqlserver://vNTDACWSSQLD002:1433;"
//						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			log.info("connection created.");		
		} catch (Exception e) {
			log.error("Connection error: "+e.getMessage());
		}
		
	}
 public static DBConnection getInstance() {
	if (instance==null) {
		instance=new DBConnection();
	}
		return instance;	
}
	
	public Connection getConnection() {
		return conn;
		
	}

	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		try {
		if (rs!=null && ! rs.isClosed())
	    {
	        try
	        {
	            rs.close();

	        }
	        catch(SQLException e)
	        {
	            log.error("The result set cannot be closed.", e);
	        }
	    }
	    if (stmt != null)
	    {
	        try
	        {
	            stmt.close();
	        } catch (SQLException e)
	        {
	            log.error("The statement cannot be closed.", e);
	        }
	    }
	    if (conn != null)
	    {
	        try
	        {
	            conn.close();
	        } catch (SQLException e)
	        {
	            log.error("The data source connection cannot be closed.", e);
	        }
	    }
		}catch (Exception e) {
			log.debug("close all");
		}
	}
	public static void main(String[] args) {
		//System.out.println("successfull");
		new DBConnection();
	}
}

