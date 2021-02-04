package basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			
			int i = stmt.executeUpdate("insert into student (name,id,mail)" 
					+"values('Naresh',22,'naresh@123gmail.com')");
		
			System.out.println(i+" records inserted in student table");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
