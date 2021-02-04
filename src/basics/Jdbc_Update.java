package basics;

import java.sql.*;
public class Jdbc_Update {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			
			int i= stmt.executeUpdate("update student set name='Mari' where id=22");
			System.out.println(i+"records updated");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
