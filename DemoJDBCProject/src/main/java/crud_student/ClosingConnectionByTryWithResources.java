package crud_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClosingConnectionByTryWithResources {

	public static void main(String[] args) {	
		String url = "jdbc:postgresql://localhost:5432/demo_jdbc";
		String username = "postgres";
		String password = "root";
		try (Connection con = DriverManager.getConnection(url, username, password)){
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
