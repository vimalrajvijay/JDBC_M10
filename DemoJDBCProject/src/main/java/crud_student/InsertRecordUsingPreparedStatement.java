package crud_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertRecordUsingPreparedStatement {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demo_jdbc";
		String username = "postgres";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			String query = "insert into student values(?, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setInt(1, 103);
			pstm.setString(2, "MNO");
			pstm.setInt(3, 24);
			
			pstm.execute();
			
			pstm.setInt(1, 104);
			pstm.setString(2, "XYZ");
			pstm.setInt(3, 25);
			
			pstm.execute();
			
			con.close();
			
			System.out.println("Student is Inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
