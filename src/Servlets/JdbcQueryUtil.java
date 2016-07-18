package Servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcQueryUtil {

	public static ResultSet executeQuery(String sql) {
		Connection connection;
		ResultSet rs;
		Statement stmt;
		
		try {		

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");

			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		return rs;

	}
}
