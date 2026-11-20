package crud_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demo_jdbc";
		String username = "postgres";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stm = con.createStatement();
			String query = "update student set age = 27";
			int rowsAffected = stm.executeUpdate(query);
			System.out.println(rowsAffected);
			con.close();
			System.out.println("Student is Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
