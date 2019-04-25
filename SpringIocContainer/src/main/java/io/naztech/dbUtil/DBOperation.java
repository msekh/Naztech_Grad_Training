package io.naztech.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import io.naztech.model.User;
import lombok.extern.slf4j.*;


@Slf4j
public class DBOperation {

	private static Connection conn;
	private static PreparedStatement stmt;
	private static ResultSet rs;
	public static DBConnection dbConnection;
	
	public static void insert(User u) {
		String query = "INSERT INTO T_USER_INFO(userId,name,email,pass) VALUES (?,?,?,?)";
		try {
			conn = DBConnection.getInstance().getConnection();
			stmt=conn.prepareStatement(query);
			stmt.setInt(1, u.getUid());
			stmt.setString(2, u.getName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPass());
			stmt.executeUpdate();
		} catch (Exception e) {
			log.error("insertion failed: " + e.getMessage());
		}
	}
}
