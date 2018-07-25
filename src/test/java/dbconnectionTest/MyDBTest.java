package dbconnectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MyDBTest 
{
	@Test
	public void dbTest() 
	{
		String qstring = "select * from employee_details;";
		try 
		{
			//loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam_db1", "root", "root");
			
			//creating statement object
			Statement stmt = conn.createStatement();
			
			//executing query
			ResultSet rs = stmt.executeQuery(qstring);
			
			while (rs.next()) 
			{
				System.out.println(rs.getString("emp_name")+" Details are below");
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
