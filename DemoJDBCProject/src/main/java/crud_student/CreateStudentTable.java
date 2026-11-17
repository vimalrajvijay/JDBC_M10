package crud_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {

	public static void main(String[] args) {
		
		try {
			//Step 1 : Load the Driver
			Class.forName("org.postgresql.Driver");
			
			//Step 2 : Create the Connection
			String url = "jdbc:postgresql://localhost:5432/demo_jdbc";
			String username = "postgres";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Step 3 : Create the Statement
			Statement stm = con.createStatement();
			
			//Step 4 : Execute the Query
			String query = "create table student (id int primary key, name varchar(20), age int)";
			stm.execute(query);
			
			//step 5 : close the Connection
			con.close();
			
			System.out.println("Table is Created");
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
