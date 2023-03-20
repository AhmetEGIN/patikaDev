package patikaDev.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	private static final String DB_URL = "jdbc:postgresql://localhost/university";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "12345";

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			connection.setAutoCommit(false);
			
			PreparedStatement statement = connection.prepareStatement("INSERT INTO students (name, class) VALUES (?,?)");
			statement.setString(1, "John");
			statement.setInt(2, 1);
			statement.executeUpdate();
			
//			if (true) {
//				throw new SQLException();
//			}
			
			statement.setString(1, "Doe");
			statement.setInt(2, 5);
			statement.executeUpdate();
			
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
