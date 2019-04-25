package io.mtech.dbUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import io.mtech.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBOperation {
	private static Connection conn;
	private static PreparedStatement stmt;
	private static ResultSet rs;
	public static DBConnection dbConnection;

	public static void insert(User u) {
		String query = "INSERT INTO T_USER_INFO(fullName,email,username,password) VALUES (?,?,?,?)";
		try {
			conn = DBConnection.getInstance().getConnection();
			// conn = dbConnection.getConnection();
			stmt = conn.prepareStatement(query);

			stmt.setString(1, u.getName());
			stmt.setString(2, u.getEmail());
			stmt.setString(3, u.getUName());
			stmt.setString(4, u.getPass());
			stmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			log.error("insertion failed: " + e.getMessage());
		}
	}

	public static void deleteUser(int id) {
		String query = "DELETE FROM T_USER_INFO where slNo =" + id;
		try {
			// conn.setAutoCommit(false);
			conn = DBConnection.getInstance().getConnection();
			stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			log.info("delete failed.  " + e.getMessage());
		}

	}

	public static User getSingleUser(int id) {
		String query = "SELECT *FROM T_USER_INFO where userId =" + id;
		User user = new User();
		try {
			// conn.setAutoCommit(false);
			conn = DBConnection.getInstance().getConnection();
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			if (rs.next()) {
				user.setUid(rs.getInt("userId"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPass(rs.getString("pass"));
			}

		} catch (Exception e) {
			log.error("single id fetch failed.");
			return null;
		}
		return user;

	}

	public static void updateUser(User user) {

		try {// conn.setAutoCommit(false);
			log.info("name: " + user.getUid());
			conn = DBConnection.getInstance().getConnection();
			String sql = "UPDATE T_USER_INFO SET  name = '" + user.getName() + "', email='" + user.getEmail()
					+ "', pass = '" + user.getPass() + "' WHERE userId = '" + user.getUid() + "'";
			PreparedStatement stmt = conn.prepareStatement(sql);

//		stmt.setString(2, user.getName());
//		stmt.setString(3, user.getEmail());
//		stmt.setString(4, user.getPass());
//		stmt.setInt(1, user.getUid());
			stmt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			log.error("update failure." + e);
		}
	}

	// data fetch from database
	public static List<User> fetch() {
			List<User> uList = new ArrayList<>();
			//String sql = "SELECT * FROM T_USER_INFO";
			String sql="{ call spUser_GetByAll()}";
			try {
				conn =  DBConnection.getInstance().getConnection();
				CallableStatement stmt = conn.prepareCall(sql);
				rs = stmt.executeQuery();
				while(rs.next()) {
				 uList.add(new User(rs.getInt(1),
				rs.getString(2),rs.getString("Email"),rs.getString("username")
							 ,rs.getString("password")));
				}
//				while (rs.next()) {
//					empList.add(new User(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)));
//				}
			} catch (SQLException e) {
				log.info("Fetched Failed: "+ e);
			} 
			return uList;
		}
}
