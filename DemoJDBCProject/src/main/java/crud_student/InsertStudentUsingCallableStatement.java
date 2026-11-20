package crud_student;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentUsingCallableStatement {
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demo_jdbc";
		String username = "postgres";
		String password = "root";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "call abc(?, ?, ?)";
			CallableStatement cstm = con.prepareCall(query);
			cstm.setInt(1, 105);
			cstm.setString(2, "PQR");
			cstm.setInt(3, 25);
			cstm.execute();
			con.close();
			System.out.println("Student is Inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
